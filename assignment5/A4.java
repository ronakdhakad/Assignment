//WAP to print table of a number.
import java.util.Scanner;
class A4{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int a=1;
        int table=0;

        while(a<=10){
            table=a*n;
            System.out.println(n+"*"+a+"="+table);
            a++;
        }


    }
    
}
