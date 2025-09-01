import java.util.Scanner;
class Code7{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter area of triangle :");
        int area =sc.nextInt();

        System.out.println("enter base of triangle :");
        int base =sc.nextInt();
        
        int height;
        height=((area*2)/base);

        System.out.println("height of triangle is: "+height);




    }
}