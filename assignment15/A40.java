import java.util.Scanner;
public class A40 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int s;
        int countEven=0;
        int countOdd=0;
        boolean find=false;
        while(num!=0){
            s=num%10;
            num=num/10;
            if(s%2==0)
                countEven++;
            else
                countOdd++;
        }
        System.out.println("Number of even number is: "+countEven);
        System.out.println("number of odd digits is: "+countOdd);

    }
}