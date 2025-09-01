import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        if(num1==num2)
            System.out.println("Both number are equals");
        else
            int greater=(num1>num2) ? num1:num2;
            System.out.println(greater+" is greater");
    }
}