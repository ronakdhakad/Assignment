import java.util.Scanner;
class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number 1st: ");
        int a=sc.nextInt();
        System.out.print("Enter number 2nd: ");
        int b=sc.nextInt();

        int sum=a+b;
        System.out.println("Addition: "+sum);

        int sub=a-b;
        System.out.println("Subtraction: "+sub);

        int product=a*b;
        System.out.println("Multiplication: "+product);

        int division=a/b;
        System.out.println("Division: "+division);

        int remainder=a%b;
        System.out.println("Modulus: "+remainder);
    }
}
