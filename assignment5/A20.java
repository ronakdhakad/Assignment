import java.util.Scanner;
class A20{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N terms");
        int n=sc.nextInt();
        int table;
        for(int i=0;i<n;i++){
            table=i*7;
            System.out.print(table+" ");
        }
    }
}
