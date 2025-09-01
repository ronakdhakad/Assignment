import java.util.Scanner;
    class TestMain{
        public static void main(String arg[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number of elements");
            int n=sc.nextInt();
            int arr[]=new int[n];
            int sum=0;
            for(int i=1; i<n;i++){
                System.out.println("Enter an element");
                arr[i] =sc.nextInt();
                sum=sum+i;
            }
            System.out.println("Sum of array is "+sum);

        }
    }