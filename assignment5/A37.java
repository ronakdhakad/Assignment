import java.util.Scanner;
public class A37 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int s;
        int a=0;
        boolean find=false;
        while(num!=0){
            s=num%10;
            a=a*10+s;
            num=num/10;
            if(num==a)
                find=true;
        }
        if(find)
            System.out.println(a+" is palindrome");
        else
            System.out.println(a+" is not a palindrome");
    }
    
}
