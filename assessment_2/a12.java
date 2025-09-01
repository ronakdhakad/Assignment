import java.util.Scanner;
class Code12{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter Hypotenuse :");
        int Hypotenuse=sc.nextInt();

        System.out.println("enter base of triangle :");
        int base=sc.nextInt();

        double length;

        //using Pythagoras the0rem
        length = Math.sqrt((Hypotenuse*Hypotenuse)-(base*base));

        //area of triangle
        double area_of_triangle=(double)((base*length)/2);

        System.out.println("length of triangle is :"+length+"cm");
        System.out.println("area of triangle is :"+area_of_triangle+"cm^2");

    }
}