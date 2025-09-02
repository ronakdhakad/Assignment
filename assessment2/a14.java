import java.util.Scanner;
class Code14{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter base :");
        int base = sc.nextInt();

        //for triangle1
        System.out.println("enter height1 :");
        int height1 = sc.nextInt();
        
        //for triangle2
        System.out.println("enter height2 :");
        int height2 = sc.nextInt();

        //area of triangle1
        double area_of_triangle1=(double)((base*height1)/2);

        //area of triangle2
        double area_of_triangle2=(double)((base*height2)/2);

        //to find area of rectangle
        double area_of_rect =(double)(area_of_triangle1+area_of_triangle2);

        System.out.println("area of rectangle is: "+area_of_rect+"m^2");
    }
}

