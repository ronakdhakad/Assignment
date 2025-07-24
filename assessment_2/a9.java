import java.util.*;
class Code9{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.println("enter side1 of triangle :");
        int side1=sc.nextInt();

        System.out.println("enter side2 of triangle :");
        int side2=sc.nextInt();

        double area;
        area=(double)(((Math.sqrt(3))/4)*(side1*side2));
        System.out.println("area of triangle is: "+area);




    }
}