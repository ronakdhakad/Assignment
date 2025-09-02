import java.util.Scanner;
class Code8{
    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);

        System.out.println("enter area triangle");
        double area =sc.nextDouble();

        System.out.println("enter height of triangle :");
        int height=sc.nextInt();
        
        double base;

        base=(double)((area*2)/height);
        System.out.println("base of triangle is: "+base);




    }
}