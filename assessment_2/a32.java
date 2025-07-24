import java.util.Scanner;
class Code32{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        int garden_side=sc.nextInt();

        int garden_area=garden_side*garden_side;

        System.out.println("enter length");
        int pool_side = sc.nextInt();

        int pool_area=pool_side*pool_side;

        //area of remaining garden
        int area=garden_area-pool_area;

        System.out.println("area of remaining garden is : "+area+"m^2");
    }
}

