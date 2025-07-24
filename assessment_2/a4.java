import java.util.Scanner;
class Code4{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter length :");
        int length=sc.nextInt();

        System.out.println("enter width :");
        int width =sc.nextInt();
        int area_plot=(length*width);

        System.out.println("enter cost of tile");

        double cost=sc.nextDouble();
        float cost_tile;

        cost_tile=(float)(area_plot*cost);
        System.out.println("cost of tile is :"+cost_tile);




    }
}