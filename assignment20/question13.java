//Write a program to create UserDefined Exception
import java.util.Scanner;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String msg){
        super(msg);
    }
}
class Main{
    public static void checkAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Not eligible for voting.");
        }else{
            System.out.println("Eligible for voting.");
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age : ");
        int age=sc.nextInt();
        try{
            checkAge(age);
        }catch(InvalidAgeException e){
            System.out.println("Exception : "+e);
        }
    }
}