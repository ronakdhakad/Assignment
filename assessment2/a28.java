import java.util.Scanner;
class Code28{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter rate");
        int rate_per_square_meter=sc.nextInt();

        System.out.println("enter length");
        int length=sc.nextInt();

        System.out.println("enter width");
        int width = sc.nextInt();

        //area of carpet
        int area_of_carpet=length*width;

        //price of the carpet 
        int price=rate_per_square_meter*area_of_carpet;

        System.out.println("price of carpet is : "+price+"m^2");
    }
}


