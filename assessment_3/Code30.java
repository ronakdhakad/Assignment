import java.util.Scanner;
class Code30 {
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a year");
        int a=sc.nextInt();
        if(a%4==0)
            System.out.println(a+" :is leap year");
        else
            System.out.println(a+" :is not a leap year");
    }
    
}
