import java.util.Scanner;
class Code16{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        //length and width of rectangular dinning room
        System.out.println("enter length of carpet :");
        int length = sc.nextInt();

        System.out.println("entre width of carpet :");
        int width = sc.nextInt();

        //area of carpet for cover her dinning room
        int area=(length*width);

        System.out.println("area of carpet is: "+area+"m^2");
    }
}
