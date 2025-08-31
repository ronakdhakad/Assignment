//WAP to print a statement 1000 number of times.
import java.util.Scanner;
    class A1{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number");
            int n=sc.nextInt();
            int i=1;
            while(i<=n){
                System.out.println(i);
                i++;
            }

        }

        
    }