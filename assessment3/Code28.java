import java.util.Scanner;
class Code28{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number first number");
        int num1=sc.nextInt();

        System.out.println("enter number second number");
        int num2=sc.nextInt();

        System.out.println("enter operator ( +,-,*,/)");
        char op=sc.next().charAt(0);

        switch (op){
            case '+':
                System.out.println("sum of num1 and num2 is: "+num1+num2);
                break;
            case '-':
                System.out.println("subtraction of num1 and num2 is: "+ (num1-num2));
                break;
            case '*':
                System.out.println("multiplication of num1 and num2 is: "+num1*num2);
                break;
            case '/':
                System.out.println("division of num1 and num2 is: "+num1/num2);
                break;
            default:
                System.out.println("invalid input");
        }    
    
    }
}