//2.A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
//Ask user for quantity
//Suppose, one unit will cost 100.
//Judge and print total cost for user.

import java.util.Scanner;
class Code2{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        float discount=10/100f;

        int cost=100;

        System.out.println("enter quantity");
        int quantity=sc.nextInt();

        double total_cost=quantity*cost;
        double total=(float)(total_cost*discount);

        float discount_cost=(float)(total_cost-total);

        if(total_cost>=1000){
            System.out.println("total cost is: "+total_cost);
            System.out.println("discount cost is: "+total);
            System.out.println("after discount total cost is: "+discount_cost);
        }else
            System.out.println("no discount total cost is: "+total_cost); 

    }

    
}
