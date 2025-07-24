import java.util.Scanner;
class Code21{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        //bricks for wall
        System.out.println("enter length");
        int length = sc.nextInt();

        System.out.println("enter breadth");
        int breadth = sc.nextInt();

        System.out.println("enter height");
        int height=sc.nextInt();

        //brick in centimeter
        int length_centimeter = length*100;
        int breadth_centimeter = breadth*100;
        int height_centimeter=height*100;

        //volume of wall
        int volume_of_wall=(length_centimeter*breadth_centimeter*height_centimeter);

        // a brick size
        System.out.println("enter len");
        int len = sc.nextInt();

        System.out.println("enter bre");
        int bre = sc.nextInt();

        System.out.println("enter hei");
        int hei=sc.nextInt();

        //volume of one brick 
        int volume_of_brick=(len*bre*hei);
        //bricks used in wall 
        int total_bricks=(volume_of_wall/volume_of_brick);

        System.out.println("total bricks used for wall is : "+total_bricks);
    }
}
