import java.util.Scanner;
class Code22{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter first number ");
        int num1=sc.nextInt();

        System.out.println("enter second number ");
        int num2=sc.nextInt();
        
        System.out.println("enter third number ");
        int num3=sc.nextInt();

        int max=(num1>num2)?num1:(num2>num3)?num2:num3;

        System.out.println("maximum number "+max);

    }
    
}
