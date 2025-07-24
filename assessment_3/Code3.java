//3.A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
//Ask user for their salary and year of service and print the net bonus amount.
import java.util.Scanner;
class Code3{
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);

        System.out.println("enter your salary");
        int salary =sc.nextInt();
    
        
        System.out.println("enter year of service");
        int year =sc.nextInt();

        float bonus=5/100f;

        double net_bonus=salary*bonus;

        if(year>=5){
            System.out.println("the net bonus amount is: "+net_bonus);

        }else{
            System.out.println("no bonus");
        }
    }
    
}
