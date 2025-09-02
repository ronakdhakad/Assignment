import java.util.Scanner;
class Code2{
    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);

        System.out.println("enter area of rectangle ");
        int area =sc.nextInt();

        System.out.println("enter breadth of rectangle ");
        int breadth =sc.nextInt();

        int length;
        int perimeter;

        length=(area/breadth);
        perimeter=2*(length+breadth);

        System.out.println("length of rectangle is: "+length);
        System.out.println("perimeter of rectangle is: "+perimeter);




    }
}