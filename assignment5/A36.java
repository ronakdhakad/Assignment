import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        int a;
        int s=0;
        while(num!=0){
            a=num%10;
            s=(s*10)+a;
            num=num/10;
        }
        System.out.print(""+s);

    }
}





