//WAP to print N natural number.  
import java.util.Scanner;
class A2{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();

        int a=1;
         while(a<=n){
            System.out.println(a);
            a++;
         }

    }
    
}
