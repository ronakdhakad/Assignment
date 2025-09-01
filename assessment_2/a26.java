import java.util.Scanner;
class Code26{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        //carton of size
        System.out.println("enter length");
        int length = sc.nextInt();

        System.out.println("enter breadth");
        int breadth = sc.nextInt();

        //area of path
        int area_path=(length*breadth);

        //dimensions of a brick
        int length_brick =24;
        int width_brick=15;
        int area_brick=(length_brick*width_brick);

        //no of bricks
        int no_of_bricks=(area_path/area_brick);

        System.out.println("no of bricks required is : "+no_of_bricks);
    }
}
