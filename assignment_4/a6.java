import java.util.Scanner;
class A{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();

        int i=1;
        int sum=1;

        while(i<=n){
            System.out.print(sum+"\t");
            sum=sum+2;
            i++;
        }
    }
    
}
