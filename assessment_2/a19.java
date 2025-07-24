import java.util.Scanner;
class Coder19{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        //cube
        System.out.println("enter edge");
        int edge =sc.nextInt();
        int volume_of_cube=(edge*edge*edge);

        //cuboid
        System.out.println("enter length");
        int length=sc.nextInt();

        System.out.println("enter width");
        int width = sc.nextInt();

        System.out.println("enter height");
        int height=sc.nextInt();
        int volume_of_cuboid=length*width*height;
        
        //difference
        int difference=volume_of_cube-volume_of_cuboid;

        System.out.println("difference between cube and cuboid: "+difference+" cm^2");
    }
}
