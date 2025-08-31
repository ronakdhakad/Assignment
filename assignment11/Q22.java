import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        

        int greater=(num1>num2&&num1>num3) ? num1:(num2>num1&&num2>num3) ? num2 :num3;
        System.out.println(greater+" is greater");
    }
}