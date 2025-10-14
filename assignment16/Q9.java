// 9) WAP to find out the largest(maximum) element from an array
// 10) WAP to find out the smallest(minimum) element from an array
class Q9{
    public static void main(String[] args){
        int arr[] = new int[args.length];
        for(int i = 0;i<args.length;i++){
            arr[i] = Integer.parseInt(args[i]);
        }
        int max = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max)
            max = arr[i];
        }
        System.out.print("THE MAXIMUM NUMBER IS : "+ max);
    }
}