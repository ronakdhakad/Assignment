import java.util.Scanner;
class Code40{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter radius ");
        int radius=sc.nextInt();

        System.out.println("enter height ");
        int height=sc.nextInt();

        double pie=3.1416;

        //volume of cylinder (pie*r^2*h)
        double volume=((pie*radius*radius*height));

        System.out.println("volume of cylinder is :"+volume+"cm^3");
    }
}