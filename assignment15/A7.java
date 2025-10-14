//WAP to check whether entered number is prime or not.
import java.util.Scanner;
    class A7{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n =sc.nextInt();
        int i;
        int s=1;
        for(i=2;s!=0; ){
            s=n%i;
            i++;
        }
        if((i-1)==n){
            System.out.println(n+" is prime number");
        }else{
            System.out.println(n+" is not a prime number");
        }

    }   
}   