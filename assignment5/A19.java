import java.util.Scanner;
class A19{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N terms");
        int n=sc.nextInt();
        float num;
        float sum=0;
        for(int i=1;i<=n;i++){
            num=(1.2f/i);
            sum=sum+num;
        }
        System.out.print("sum of term is: "+sum);
    }
}

