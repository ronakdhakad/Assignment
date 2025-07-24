//1. Take values of length and breadthof length rectangle from user and check if it is square or not.

import java.util.Scanner;

class Code1{
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    
    System.out.println("enter length of rectangle");
    int length =sc.nextInt();

    System.out.println("enter breadth of rectangle");
    int breadth=sc.nextInt();

    if(length==breadth)
        System.out.println("it is square ");
    else
        System.out.println("it is not square");

    }

}
