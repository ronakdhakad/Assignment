import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter principle: ");
        int p=sc.nextInt();
        System.out.print("Enter rate: ");
        int r=sc.nextInt();
        System.out.print("Enter time: ");
        int t=sc.nextInt();

        double simpleInterest=(p*r*t)/100f;
        System.out.print("Simple Interest is: "+simpleInterest);
    }
}