import java.util.Scanner;
    class Test{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter range of row");
            int m=sc.nextInt();
            System.out.println("Enter range of column");
            int n=sc.nextInt();
            int arr[][]=new int[m][n];
            System.out.println("Enter 1st matrix");
            for(int i=0;i<m;i++){
                System.out.println("Enter "+(i+1)+" row");
                for(int j=0;j<n;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            int arr2[][]=new int[m][n];
            int arr1[][]=new int[m][n];
            System.out.println("Enter 2nd matrix");
            for(int i=0;i<m;i++){
                System.out.println("Enter "+(i+1)+" row");
                for(int j=0;j<n;j++){
                    arr2[i][j]=sc.nextInt();
                }
            }
            System.out.println("");
            System.out.println("Matrix 1st");
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                   System.out.print(" "+arr[i][j]);
                }
                System.out.println("");
            }
            System.out.println("");
            System.out.println("Matrix 2nd");
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                   System.out.print(" "+arr2[i][j]);
                }
                System.out.println("");
            }
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    arr1[i][j]=arr[i][j]+arr2[i][j];
                }
            }
            System.out.println("");
            System.out.println("Addition of two matrix");
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                   System.out.print(" "+arr1[i][j]);
                }
                System.out.println("");
            } 
        }
    }

