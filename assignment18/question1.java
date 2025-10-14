import java.util.Scanner;

class Test{
    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error! Division by zero.");
            return Double.NaN;
        }
        return a / b;
    }

    // Function to display the menu and get user choice
    public static char menu(Scanner scanner) {
        System.out.println("Select an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Exit (E)");

        System.out.print("Enter your choice: ");
        return scanner.next().charAt(0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;
        double num1, num2, result;

        do {
            choice = menu(scanner);

            if (choice=='+'||choice=='-'||choice=='*'||choice=='/') {
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();

                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();

                switch(choice) {
                    case '+':
                        result = add(num1, num2);
                        System.out.println("Result: " + result);
                        break;
                    case '-':
                        result = subtract(num1, num2);
                        System.out.println("Result: " + result);
                        break;
                    case '*':
                        result = multiply(num1, num2);
                        System.out.println("Result: " + result);
                        break;
                    case '/':
                        result = divide(num1, num2);
                        if (!Double.isNaN(result)) {
                            System.out.println("Result: " + result);
                        }
                        break;
                }
            } else if (choice == 'E'||choice=='e') {
                System.out.println("Exiting the program!");
            } else {
                System.out.println("Invalid choice! Please select a valid option.");
            }

            System.out.println();

        } while (choice != 'E'&&choice!='e');
    }
}
