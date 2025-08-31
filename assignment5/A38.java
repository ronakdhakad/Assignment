import java.util.Scanner;
public class A38 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int a=0;
        int s;
        int b=num;
        boolean find=false;
        while(num!=0){
            s=num%10;
            num=num/10;
            a=a+s*s*s;
            if(b==a)
                find=true;
        }
        if(find)
            System.out.println(b+" is armstrong number");
        else
            System.out.println(b+" is not an armstrong");

    }
}