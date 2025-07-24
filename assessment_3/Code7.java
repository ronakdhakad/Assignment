/* 7. A student will not be allowed to sit in exam if his/her attendance  is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not. */
import java.util.Scanner;
class Code7{
    public static void main(String arg[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter total no. of classes");
        int held_classes=sc.nextInt();

        System.out.println("enter no. of attendance  ");
        int attended_classes=sc.nextInt();

        float percent_of_attendance =(float)(held_classes*(attended_classes/100f));
        //System.out.println(""+percent_of_attendance );

        if(percent_of_attendance <=75){
            System.out.println("your attendance  is :"+percent_of_attendance +" you are not allowed to sit in exam your attendance  is under 75% ");
        }else{
            System.out.println("your attendance  is :"+percent_of_attendance +" you are allowed to sit in exam your attendance  is above 75% ");
        }

    }

    
}
