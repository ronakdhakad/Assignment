import java.util.Scanner;
class Code3{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("enter length of tiles :");
    int length=sc.nextInt();

    System.out.println("enter breadth of tiles :");
    int breadth=sc.nextInt();

    int area_of_tiles=length*breadth;

    System.out.println("enter length of rectangular region :");
    int length1=sc.nextInt();

    System.out.println("enter breadth of rectangular region :");
    int breadth1=sc.nextInt();

    int area_of_rectangular_region=length1*breadth1;
    int tiles=area_of_rectangular_region/area_of_tiles;

    System.out.println("total number of tiles needed in rectangular region is :"+tiles);






    
    }


    
}