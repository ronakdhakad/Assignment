import java.util.*;
class A{
    public static void main(String args[]){

        int height=4;
        int slant_height=5;
        double pie=3.1416;

        //to find radius with the help of pythogerous theorem
        double radius=(double)(Math.sqrt((slant_height*slant_height)-(height*height)));

        //surface area of cylinder (2*pie*r*h)+(2*pie*r^2)
        double area=(double)(pie*radius*radius);
        double cost_of_polishing=10;
        double cost=(double)(area*cost_of_polishing);

        System.out.println("cost of polishing is :"+cost+"cm^2");
    }
}