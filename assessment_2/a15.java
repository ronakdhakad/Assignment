import java.util.Scanner;
class Code15{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        //shelly's garden
        System.out.println("enter length of shells garden :");
        int length =sc.nextInt();

        System.out.println("enter breadth of shellys garden :");
        int breadth =sc.nextInt();

        int area_of_shellys_garden=length*breadth;

        //rachel's garden
        System.out.println("enter rachels garden side1 :");
        int side1=sc.nextInt();

        System.out.println("enter rachels garden side2 :");
        int side2 =sc.nextInt();
        int area_of_rachels_garden=side1*side2;

        //rachels garden is larger than shellys garden
        int difference=area_of_rachels_garden-area_of_shellys_garden;

        System.out.println("rachels garden is :"+difference+" m^2 bigger than shellys garden");
    }
}

