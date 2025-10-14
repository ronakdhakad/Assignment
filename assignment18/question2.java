import java.util.Scanner;

class Test
{
    int num1, num2; 
    void init() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();
    }
    void add() 
    {
        int sum = num1 + num2;
        System.out.println("Sum of the two numbers: " + sum);
    }

    public static void main(String[] args) 
    {
        Addition obj = new Addition();
        obj.init();
        obj.add();
    }
}
