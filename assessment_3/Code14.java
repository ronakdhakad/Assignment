/* 14.Write a program to accept percantage from the user and
display grade according to the following criteria
  Marks	  		Grade
  > 90       		 A
  >80 and <=90		 B
  >=60 and <=80		 C
  below 60		 D  */
import java.util.Scanner;
class Code14{
    public static void main(String arg[]){

    Scanner sc=new Scanner(System.in);

    System.out.println("enter your percentage (in out of 100)");
    double marks=sc.nextDouble();

    if(marks>90){
        System.out.println("your grade is 'A'");
    }else if(marks>80&&marks<=90){
        System.out.println("your grade is 'B'");
    }else if(marks>=60&&marks<=80){
        System.out.println("your grade is 'C'");
    }else{
        System.out.println("your grade is 'D'");    
    
    }



    }
}
