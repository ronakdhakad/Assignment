import java.util.*;
class A{
    public static void main(String args[]){
        int side1 =10;
        int side2 =9;
        int perimeter=36;
        int side3=((perimeter)-(side1+side2));
        int s=((side1+side2+side3)/2);
        double area_of_triangle;
        area_of_triangle=(double)Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        System.out.println("area of triangle is: "+area_of_triangle);




    }
}