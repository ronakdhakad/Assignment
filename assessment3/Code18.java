/* 1. WAP to calculate percentage of student */
import java.util.Scanner;
public class Code18{
    public static void main(String arg[]){

    Scanner sc=new Scanner(System.in);

    System.out.println("enter marks of maths");
    int marks1=sc.nextInt();
    
    System.out.println("enter marks of physics");
    int marks2=sc.nextInt();
    
    System.out.println("enter marks of chemistry");
    int marks3=sc.nextInt();
    
    double percentage=((marks1+marks2+marks3)/3);

    System.out.println("percentage of student is: "+percentage);
    }



    
}

