import java.util.Scanner;
public class Code36 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter three angles of triangle ");
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        int a3=sc.nextInt();

        if((a1+a2+a3)==180){
            System.out.println("this triangle is valid");
        }else{
            System.out.println("the triangle is not valid");
        }

    }
    
}
