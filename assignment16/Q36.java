// 36) WAP to reverse all the elements of an array
class Q36{
    public static void main(String[] args){
        int[] arr = {2,5,4,6,7};
        int n = arr.length;
        for(int i = n-1;i>=1;i--){
            
            System.out.print(arr[i] + " ");
        }
        System.out.print(arr[0]);
    }
}