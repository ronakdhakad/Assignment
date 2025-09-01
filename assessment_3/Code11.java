/*11. Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
if employee is female, then she will work only in urban areas.
if employee is a male and age is in between 20 to 40 then he may work in anywhere 
if employee is male and age is in between 40 t0 60 then he will work in urban areas only.
And any other input of age should print "ERROR". */

import java.util.Scanner;
class Code11{
    public static void main(String arg[]){

        Scanner sc =new Scanner(System.in);
        System.out.println("enter your age");
        int age=sc.nextInt();

        System.out.println("enter your sex(m or f)");
        char sex=sc.next().charAt(0);

        System.out.println("marital status(y or n)");
        char marital=sc.next().charAt(0);

        if(sex=='f'){
            System.out.println("female works in urban areas");
        }else if(sex=='m'&&(age >=20 && age<=40)){
            System.out.println("you can  do work anywhere");
        }else if(sex=='m'&&(age >40 && age<=60)){
            System.out.println("male above 40 they works in urban areas");
        }else{
            System.out.println("ERROR :please enter valid details");
        }

        
    }
}
