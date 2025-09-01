import java.util.Scanner;
    class TestMain{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter an element number");
            int n=sc.nextInt();
            int arr[]=new int[n];

            for(int i=0;i<n;i++){
                System.out.println("Enter "+i+" index data");
                arr[i]=sc.nextInt();
            }

            for(int i=0;i<n;i++){
                System.out.println("Index "+i+"  = "+arr[i]);
            }
        }
    }