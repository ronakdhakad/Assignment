import java.util.Scanner;
class Code6{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter side1 of triangle :");
        int side1 =sc.nextInt();

        System.out.println("enter side2 of triangle :");
        int side2 =sc.nextInt();

        System.out.println("enter perimeter of triangle :");
        int perimeter=sc.nextInt();

        int side3=((perimeter)-(side1+side2));
        int s=((side1+side2+side3)/2);
        double area_of_triangle;
        area_of_triangle=(double)Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        System.out.println("area of triangle is: "+area_of_triangle);




    }
}