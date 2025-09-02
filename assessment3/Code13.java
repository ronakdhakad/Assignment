/* 13. Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
Test Data
Input number: 3
Expected Output :
Wednesday*/
import java.util.Scanner;
class Code13{
    public static void main(String arg[]){

        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number (1 to 7)");
        int number =sc.nextInt();

        if(number==1){
            System.out.println("MONDAY");
        }else if(number==2){
            System.out.println("TUESDAY");
        }else if(number==3){
            System.out.println("WEDNESDAY");
        }else if(number==4){
            System.out.println("THURSDAY");
        }else if(number==5){
            System.out.println("FRIDAY");
        }else if(number==6){
            System.out.println("SATURDAY");
        }else if(number==7){
            System.out.println("SUNDAY");
        }else
            System.out.println("PLEASE ENTER A NUMBER BETWEEN 1 TO 7");
    }
}
