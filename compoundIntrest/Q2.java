import java.util.Scanner;
class Test {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side of triangle");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        double s=(double)(a+b+c)/2;
        double herons=Math.sqrt(s*((s-a)*(s-b)*(s-c)));
        System.out.println("Area : "+herons);
        }
    
}
