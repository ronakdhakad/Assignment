import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();

        String x=(num%2==0) ? " is even":" is odd";
        System.out.println(num+x);
    }
}