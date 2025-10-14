// 28) WAP to check whether entered number is prime or not.
import java.util.Scanner;
class Q28{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = sc.nextInt();
        boolean flag = false;
        int count = 0;
        for(int i = 2;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count ==1){
            System.out.print("IT is a prime number");
        }
    
    }
}