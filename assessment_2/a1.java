import java.util.Scanner;
class Code1{
    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);

        System.out.println("enter perimeter of rectangle ");
        int perimeter =sc.nextInt();

        System.out.println("enter length of rectangle ");
        int length=sc.nextInt();

        float breadth=((perimeter-(2*length))/2f);
        float area=(length*breadth);

        System.out.println("breadth of rectangle is :"+breadth);
        System.out.println("area of rectangle is :"+area);
    }
}
