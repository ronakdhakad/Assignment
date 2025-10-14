// 10) WAP to find out the smallest(minimum) element from an array
class Q10{
    public static void main(String[] args){
          int arr[] = new int[args.length];
        for(int i = 0;i<args.length;i++){
            arr[i] = Integer.parseInt(args[i]);
        }
        int min = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<min)
            min = arr[i];
        }
        System.out.print("THE MINIMUM NUMBER IS : "+ min);
    }
}