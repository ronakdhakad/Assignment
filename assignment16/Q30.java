// 30) WAP to print N even numbers.
import java.util.Scanner;
class Q30{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = sc.nextInt();
        for(int i = 1;i<n;i++){
            if(i%2==0){
                System.out.print(i+ " ");
            }
        }
    }
}