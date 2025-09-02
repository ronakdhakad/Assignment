import java.util.Scanner;
public class Code24{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        if(a>0){
            System.out.println("that number is positive");
        }else if(a<0){
            System.out.println("that number is negative");
        }else{
            System.out.println("that number is neutral");
        }

    }
    
}
