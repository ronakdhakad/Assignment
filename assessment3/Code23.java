import java.util.Scanner;
public class Code23{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        if(a%2==0)
            System.out.println("that number is even");
        else
            System.out.println("that number is odd");
    }
    
}
