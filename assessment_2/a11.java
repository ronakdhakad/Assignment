import java.util.Scanner;
class Code11{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter area:");
        int area =sc.nextInt();

        System.out.println("enter base ratio:");
        double base_ratio=sc.nextDouble();

        System.out.println("enter height ratio:");
        double height_ratio=sc.nextDouble();
        double area_ratio=((base_ratio*height_ratio)/2);

        double sqrt_area_ratio=(area/area_ratio);
        double sqrt=Math.sqrt(sqrt_area_ratio);

        double base= sqrt*base_ratio;
        double height=sqrt*height_ratio;
        System.out.println("base of triangle is :"+base);
        System.out.println("height of triangle is :"+height);




    }
}