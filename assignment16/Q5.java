// 5) WAP to reverse individual elements of an array
class Q5{
    public static void main(String[] arr){
        int n = 0,rev = 0;
        for(int i = 0;i<arr.length;i++){
            n = Integer.parseInt(arr[i]);
            while(n>0){
                int dig = n%10;
                 rev = rev * 10 + dig;
                n = n/10;
            }
        }
        System.out.print("THE REVERSE IS : " + rev );
        }
    }
