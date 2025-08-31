import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter radius of cylinder: ");
        int r=sc.nextInt();
        System.out.print("Enter height of cylinder: ");
        int h=sc.nextInt();

        double v=Math.PI*Math.pow(r,2)*h;
        System.out.println("Volume of cylinder is: "+v);

    }
}