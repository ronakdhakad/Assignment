import java.util.Scanner;
class Code38{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter volume ");
        int volume=sc.nextInt();

        System.out.println("enter radius ");
        double radius=sc.nextInt();

        double height;
        double pie=3.1416;
        height=(double)(volume/(pie*radius*radius));

        //surface area of cylinder (2*pie*r*h)+(2*pie*r^2)
        double surface_area=((2*pie*radius*height)+(2*pie*radius*radius));

        System.out.println("total surface area is :"+surface_area+"cm^2");
    }
}