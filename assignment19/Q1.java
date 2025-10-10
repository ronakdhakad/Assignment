/*
1. Problem Statement:

Create a Java program that simulates a simple calculator. 
The calculator should perform basic arithmetic operations:
 addition, subtraction, multiplication, and division. Your task is to:

· Accept two integers and an operator from the user.

· Use exception handling to catch and manage the following
 runtime exceptions:

o ArithmeticException (e.g., division by zero)

o InputMismatchException (e.g., invalid input type)

o NullPointerException (simulate a scenario where this might occur)

Requirements:

· Use Scanner for input.

· Wrap risky operations in try-catch blocks.

· Print meaningful error messages when exceptions occur.

· Use a finally block to print a closing message.
 */
import java.util.InputMismatchException;
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1,num2,choice;
        try{
            System.out.print("Enter num1 : ");
            num1=sc.nextInt();
            System.out.print("Enter num2 : ");
            num2=sc.nextInt();

            System.out.println("--- Enter operation ---");
            System.out.println("1.Addition(+)");
            System.out.println("2.Substraction(-)");
            System.out.println("3.Multiplication(*)");
            System.out.println("4.Division(/)");
            System.out.println("5.Modulo(%)");

            choice=sc.nextInt();
            switch(choice){

                case 1: 
                    System.out.println(num1+" + "+num2+" = "+(num1+num2));
                    break;
                case 2: 
                    System.out.println(num1+" - "+num2+" = "+(num1-num2));
                    break;
                case 3: 
                    System.out.println(num1+" * "+num2+" = "+(num1*num2));
                    break;
                case 4: 
                    System.out.println(num1+" / "+num2+" = "+(num1/num2));
                    break;
                case 5: 
                    System.out.println(num1+" % "+num2+" = "+(num1%num2));
                    break;

            }
        }
            catch(ArithmeticException e){
                System.out.println("Cannot be divided by zero.");
            }
            catch(InputMismatchException e){
                System.out.println("Please enter valid integers only.");
            }
            catch(NullPointerException e){
                System.out.println("Operator cannot be null.");
            }
            catch(Exception e){
                System.out.println("Unexpected error: " + e.getMessage());
            }
        
        finally{
            System.out.println("Calculator ended");
        }
    }
}