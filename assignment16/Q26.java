// 26) WAP to find out the factorial of a number.
import java.util.Scanner;
class Q26{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        for(int i = 1;i<6;i++){
            fact = fact*i;
        }
        System.out.print("The Factorial is : "+ fact);
    }
}