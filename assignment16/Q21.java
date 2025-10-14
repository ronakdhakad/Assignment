import java.util.Scanner;

class Q21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter marks of 5 subjects:");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Subject " + i + ": ");
            sum += sc.nextInt();
        }

        double per = sum / 5.0;
        System.out.println("Percentage: " + per);

        if (per >= 75 && per <= 100) {
            System.out.println("Grade: A");
        } else if (per >= 60 && per < 75) {
            System.out.println("Grade: B");
        } else if (per >= 50 && per < 60) {
            System.out.println("Grade: C");
        } else if (per >= 33 && per < 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Fail");
        }
    }
}
