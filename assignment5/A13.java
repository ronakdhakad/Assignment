//WAP to print N natural numbers in reverse order.
import java.util.Scanner;
class A13{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.print("N natural numbers in reverse order:- ");
        while(n!=0){
            System.out.print(n+" ");
            n--;
        }

    }
    
}