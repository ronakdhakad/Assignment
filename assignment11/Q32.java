import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        

        int greater=((a+b)+Math.abs(a-b))/2;
        System.out.println(greater+" is greater");
    }
}