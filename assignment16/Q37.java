// 37) WAP to reverse individual elements of an array
class Q37{
    public static void main(String[] args){
         int[] arr = {4,8,9,7,5};
        int n = arr.length;
        for(int i = n-1;i>=1;i--){
            
            System.out.print(arr[i] + " ");
        }
        System.out.print(arr[0]);
    }
}