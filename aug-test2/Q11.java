import java.util.Scanner;
class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        int count=0;
        int a=num;
        int temp=a;
            while(num>0){
                num=num/10;
                count++;
            }
            int b=1;
                for (int i=count;i!=0;i--){
                    b=temp%10;
                    System.out.println("Digits at position "+i+":"+b);
                    temp=temp/10;

            }
        
    }
    
}
