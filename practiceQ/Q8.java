//Strong number like sum of 54=5!+4!.
import java.util.Scanner;
class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int sum=0;
        int count=0;
        int m=n;
        int x=n;
        while(n%10!=0){
                count++;
                n=n/10;
        }
        int a;
        for(int j=0;j<count;j++){
            a=m%10;
            int fact=1;
            for(int k=1;k<=a;k++){
                fact=fact*k;
            }
            m=m/10;
            sum=sum+fact;
        }
        if(sum==x)
            System.out.println("Entered number is strong number");
        else
            System.out.println("Number is  not a strong number");

    }
    
}
