import java.util.Scanner;
class Code42{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);

        System.out.println("enter diameter ");
        float diameter=sc.nextFloat();
        float radius=diameter/2f;

        System.out.println("enter height");
        float height=sc.nextFloat();
        double pie=3.1416;

        //volume of cylinder (pie*r^2*h)
        double volume=((pie*radius*radius*height));

        System.out.println("volume of cylinder is :"+volume+"cm^3");
    }
}