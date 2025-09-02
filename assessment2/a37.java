import java.util.*;
class Code37{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter surface area  ");
        int surface_area=sc.nextInt();

        System.out.println("enter height of cylinder ");
        int height=sc.nextInt();

        float pie=3.1416f;
        int a=1;
        int b=height;
        float c= (float)(-(surface_area/(2f*pie)));

        //solving the quadratic equation
        //ax^2 +bx +c =0
        double quadratic_equation = a*(b*b) - 4 * a * c;

        //radius^2 + radius*height - (surface_area/2*pie)
        //its a quardatic equation
        //ax^2 +bx+c=0

        double radius= (-b+Math.sqrt(quadratic_equation))/(2*a);
        float diameter=(float)(2f*radius);

        System.out.println("diameter of cylinder is: "+diameter);
    }
}

