import java.util.Scanner;
class Code29{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        //area of floor
        System.out.println("enter length");
        int length =sc.nextInt();

        System.out.println("enter breadth");
        int breadth = sc.nextInt();
        
        int area_of_floor=(length*breadth);
        //volume of one cube
        System.out.println("enter size");
        int size=sc.nextInt();
        int area_of_tile=(size*size);

        //no of tile
        int no_of_tile=(area_of_floor/area_of_tile);

        System.out.println("total no of tiles is : "+no_of_tile);
    }
}
