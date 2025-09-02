import java.util.Scanner;
class Code5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter fence cost");
        int fence_cost=sc.nextInt();

        System.out.println("enter length of filed :");
        int length =sc.nextInt();

        System.out.println("enter rate per meter :");
        int rate_per_meter=sc.nextInt();

        int perimeter=(fence_cost/rate_per_meter);
        int breadth;
        int area_of_field;
        breadth=((perimeter/2)-length);
        area_of_field=(length*breadth);

        System.out.println("breadth of field is: "+breadth);
        System.out.println("perimeter of field is: "+perimeter);
        System.out.println("area of field is: "+area_of_field);




    }
}