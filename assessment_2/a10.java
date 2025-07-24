import java.util.Scanner;
class Code10{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter height of triangle :");
        int height =sc.nextInt();

        System.out.println("enter base of triangle :");
        int base=sc.nextInt();

        double area_of_triangle;
        area_of_triangle=(float)(((base*height)/2));
        System.out.println("area of triangle is: "+area_of_triangle);




    }
}