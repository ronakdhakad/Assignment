/*10.Write a program to check if a year is leap year or not.
If a year is divisible by 4 then it is leap year but if the year is century year like 2000, 1900, 2100 then it must be divisible by 400. */
import java.util.Scanner;
class Code10{
    
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a year: ");
        int year=sc.nextInt();

        if((year%4==0) || (year%400==0)){
            System.out.println(year+" is a leap year");
        }else{
            System.out.println(year+" is not leap year");
        }

    }
    
}
