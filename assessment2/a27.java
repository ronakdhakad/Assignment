import java.util.Scanner;
class Code27{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter cost ");
        int cost_per_meter=sc.nextInt();

        System.out.println("enter length");
        int length=sc.nextInt();

        System.out.println("enter width");
        int width = sc.nextInt();

        //area of brick
        int area_of_floor=length*width;

        //cost per square meter
        int cost=cost_per_meter*area_of_floor;

        System.out.println("cost of tiling dinner is : "+cost+"m^2");
    }
}


