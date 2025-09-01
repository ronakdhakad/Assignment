import java.util.Scanner;
    class Test{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter range of row");
            int m=sc.nextInt();
            System.out.println("Enter range of column");
            int n=sc.nextInt();
            int arr[][]=new int[m][n];

            for(int i=0;i<m;i++){
                System.out.println("Enter "+(i+1)+" row");
                for(int j=0;j<n;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            int even=0;
            int odd=0;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(arr[i][j]%2==0){
                        even=arr[i][j]+even;
                    }else{
                        odd=arr[i][j]+odd;
                    }
                }
            }
            System.out.println("sum of even number is "+even);
            System.out.println("sum of odd number is "+odd);
        }
    }
