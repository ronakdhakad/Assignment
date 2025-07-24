import java.util.Scanner;
class Code36{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter diametre ");
        int diameter=sc.nextInt();
        double radius=diameter/2;

        System.out.println("enter height ");
        int height=sc.nextInt();
        double pie=3.1416;

        //surface area of cylinder (2*pie*r*h)+(2*pie*r^2)
        double surface_area=((2*pie*radius*height)+(2*pie*radius*radius));

        System.out.println("total surface area is :"+surface_area+"cm^2");
    }
}