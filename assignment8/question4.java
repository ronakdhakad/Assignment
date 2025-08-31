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
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                   System.out.print(" "+arr[i][j]);
                }
                System.out.println("");
            }
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(i>j){
                        System.out.print(" "+arr[i][j]); 
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }


