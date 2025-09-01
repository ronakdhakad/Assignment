/* 12.A 4 digit number is entered through keyboard. Write a program to print a new number with digits reversed as of orignal one. E.g.-
INPUT : 1234        OUTPUT : 4321*/
import java.util.Scanner;
class Code12{
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);

        System.out.println("enter 4 digit number");

        String number=sc.next();

        String reversed = new StringBuilder(number).reverse().toString();


        System.out.println("reversed string is :"+reversed);

    }
    
}
