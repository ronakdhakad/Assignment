import java.util.Scanner;
class Code31{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        //side of square
        System.out.println("perimetre of square");
        int perimeter=sc.nextInt();

        System.out.println("sides of square");
        int sides_of_square=sc.nextInt();
        int side=(perimeter/sides_of_square);

        //area of square
        int area=side*side;

        System.out.println("area of square is : "+area+"m^2");
    }
}

