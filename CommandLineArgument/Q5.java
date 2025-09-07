// example showing the concept of varargs (variable arguments)

class Main{
    void test(int...args){
        System.out.println("No. of Arguments : "+args.length);
        int sum=0;
        for(int element : args){
            sum += element;
        }
        System.out.println("\nsum : "+sum);
    }
    public static void main(String args[]){
        int arr[] = new int[]{1,2,3,4,5};
        Main obj = new Main();
        obj.test(1,2);
        obj.test(1,2,3);
        obj.test(1,2,3,4);
        obj.test(new int[]{1,2,3,4,5,6,7,8,9,10});
        obj.test(arr);
    }
}