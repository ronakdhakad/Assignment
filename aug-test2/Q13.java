import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row");
        int row=sc.nextInt();
        int arr[][]=new int[row][];

        for(int i=0;i<arr.length;i++){
            System.out.println("enter size of column : ");
            int col=sc.nextInt();
            arr[i]=new int[col];
            for(int j=0;j<arr[i].length;j++){
                System.out.println("enter data for row "+i+""+j);
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }


    }
    
}
