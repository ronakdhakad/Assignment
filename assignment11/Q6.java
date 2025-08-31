import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number a: ");
        int a=sc.nextInt();
        System.out.print("Enter number b: ");
        int b=sc.nextInt();

        a=a^b;
        b=a^b;
        a=a^b;
        // a=a+b;
        // b=a-b;
        // a=a-b;
        System.out.println("Swaping a: "+a);
        System.out.println("Swaping b: "+b);

    }
}