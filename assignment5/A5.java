//WAP to find out the factorial of a number.
import java.util.Scanner;
class A5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();

        int fact=1,i=1;
        while(i<=n){
            fact=i*fact;
            i++;
        }
        System.out.println(fact+" is Factorial of "+n);

    }
    
}