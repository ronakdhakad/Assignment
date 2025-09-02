import java.util.Scanner;
class Code25{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter length");
        int length=sc.nextInt();

        System.out.println("enter breadth");
        int breadth = sc.nextInt();

        //area of brick
        int area_of_brick=length*breadth;

        //total bricks is 100
        int area_of_path=100*area_of_brick;

        System.out.println("area of path is : "+area_of_path+"cm^2");
    }
}

