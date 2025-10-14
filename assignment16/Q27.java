// 27) WAP to find out the factors of a number.
import java.util.Scanner;
class Q27{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        for(int i = 1;i<n;i++){
            if(n%i==0){
                System.out.println("The Factors Are : "+ i);
            }
        }
    }
}