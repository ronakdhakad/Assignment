import java.util.*;
class Code43{
    public static void main(String args[]){
        Scanner sc=new  Scanner(System.in);
        
        System.out.println("enter height of cylinder ");
        int height=sc.nextInt();

        System.out.println("enter slant height of cylinder ");
        int slant_height=sc.nextInt();
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