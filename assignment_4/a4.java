import java.util.Scanner;
class A{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();

        int i=1;
        int sum=0;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }   
}
