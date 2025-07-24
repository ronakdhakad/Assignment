/* 1. WAP to calculate area of circle */
import java.util.Scanner;
public class Code16{
    public static void main(String arg[]){

    Scanner sc=new Scanner(System.in);

    System.out.println("enter radius ");
    int r=sc.nextInt();

    //float pie=3.14f;
    double area=Math.PI*r*r;

    System.out.println("area of circle: "+area);
    }



    
}
