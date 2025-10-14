// 29) WAP to print Fibonacci series
import java.util.Scanner;
class Q29{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        System.out.print(num1 + " "+ num2 + " ");
        int num3 = 0;
        for(int i =1;i<n;i++){
            num3 = num1 + num2;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;
        } 

    }
}