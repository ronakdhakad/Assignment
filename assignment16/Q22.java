import java.util.Scanner;
class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest : ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();
        if (principal >= 500) {
            double amount = principal * Math.pow((1 + rate / 100), time);
            double ci = amount - principal;
            System.out.println("Compound Interest: " + ci);
        } else {
            double si = (principal * rate * time) / 100;
            System.out.println("Simple Interest: " + si);
        }
    }
}
