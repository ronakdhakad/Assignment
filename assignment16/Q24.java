// 24) WAP to find out the sum of N natural number.
// 30) WAP to print N even numbers.
import java.util.Scanner;

class Q24{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of first " + n + " natural numbers: " + sum);
    }
}
