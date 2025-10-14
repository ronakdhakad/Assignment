// 35) WAP to check whether entered number is perfect or not
import java.util.Scanner;
class Q35{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            if(n%2==0){
                System.out.println("it is a perefct no "+ " ");
                break;
            }
        }
    }
}