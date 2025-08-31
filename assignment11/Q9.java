import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sides of triangle: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        float s=(a+b+c)/2f;

        double herons=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.print("Area of triangle by heron's formula: "+herons);
    }
}