import java.util.Scanner;
class Code24{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        //dimentions of brick
        System.out.println("enter length");
        int length = sc.nextInt();

        System.out.println("enter breadth");
        int width = sc.nextInt();

        System.out.println("enter thickness");
        double thickness=sc.nextInt();

        //dimention of wall in cm
        int length_wall= length*100;
        int width_wall =width*100;
        double thickness_wall=thickness*100;

        //volume of brick
        double volume_of_brick=(double)(length*width*thickness);
        //volume of wall
        double volume_of_wall=(double)(length_wall*width_wall*thickness_wall);

        //bricks used in wall 
        double total_bricks=(double)(volume_of_wall/volume_of_brick);

        //cost per 1000 bricks is $900
        double cost_of_total_bricks=(double)((total_bricks*900)/1000);

        System.out.println("number of bricks : "+total_bricks);
        System.out.println("cost of total bricks is : "+cost_of_total_bricks);
    }
}
