import java.util.Scanner;
class Code34{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter base1");
        int base1=sc.nextInt();

        System.out.println("enter base2");
        int base2=sc.nextInt();

        System.out.println("enter height");
        int height =sc.nextInt();

        System.out.println("enter width");
        int width=sc.nextInt();

        float area_of_trapezoid=(1/2f)*((base1+base2)*height);

        int walk_area=width*height;

        float total_area=area_of_trapezoid+walk_area;

        System.out.println("wooded area of walked in trapezoid is : "+total_area+"m^2");
    }
}
