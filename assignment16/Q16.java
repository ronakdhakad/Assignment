// 16)Check if both numbers are equals or not, if not then find out the greatest number
// 17)Program to find out greater number between two numbers using conditional operator
// 18) Program to find out greater number among three numbers using conditional operator
// 19)Program to check whether entered year is a leap year or not
// 20)Program to check whether entered year is a leap year or not using nested if else
// 21)Program to get marks of 5 subjects from user and find out its grade using nested if else
// Per>=75 && per<=100 Grade A
// Per>=60 && per<75 Grade B
// Per>=50 && per<60 Grade C
// Per>=33 && per<50 Grade D
// else Fail
import java.util.Scanner;

class Q16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Both numbers are equal");
        } else if (a > b) {
            System.out.println("Greatest number is: " + a);
        } else {
            System.out.println("Greatest number is: " + b);
        }
    }
}
