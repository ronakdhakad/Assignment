import java.util.Scanner;
class Code30{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        //area of floor
        System.out.println("enter length");
        int length = sc.nextInt();

        System.out.println("enter breadth");
        int breadth =  sc.nextInt();

        int area_of_floor=(length*breadth);

        //area of one tile 
        System.out.println("enter length of tiles");
        int length_tile= sc.nextInt();

        System.out.println("enter width of tiles");
        int width_tile= sc.nextInt();
        int area_of_tile=(length_tile*width_tile);

        //no of tile
        int no_of_tile=(area_of_floor/area_of_tile);

        System.out.println("total no of tiles is : "+no_of_tile);
    }
}
