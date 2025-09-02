/*6. Write a program to print absolute vlaue of a number entered by user. E.g.-
INPUT: 1        OUTPUT: 1
INPUT: -1        OUTPUT: 1
 */
import java.util.Scanner;
public class Code6{
    public static void main(String arg[]){

        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");

        int input=sc.nextInt();

        int output=(input>0)?input:-input;

        System.out.println("input is :"+input);
        System.out.println("output is :"+output);
    }
    
}
