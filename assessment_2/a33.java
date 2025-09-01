import java.util.Scanner;
class Code33{
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        //area of garden

        System.out.println("enter length ");
        int length = sc.nextInt();

        System.out.println("enter breadth ");
        int breadth = sc.nextInt();

        int area_of_garden=(length*breadth);
        //volume of one cube
        System.out.println("enter path1 of width ");
        int width_path1=sc.nextInt();

        System.out.println("enter length of path2");
        int length_path2=sc.nextInt();

        int area_of_two_path=((length*width_path1)+(breadth*length_path2));

        //overlapping area
        int over_area=(width_path1*length_path2);

        //actual path area of path
        int area_of_path=area_of_two_path-over_area;

        //used area of garden
        int used_area=area_of_garden-area_of_path;

        System.out.println("total used area of garden is : "+used_area);
    }
}
