import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N terms");
        int n=sc.nextInt();
        int sum=0;
        int num=0;
        int temp=1;
        for (int j=1;j<=n;j++){
            num=num+temp;
            temp=temp*10;
            sum=sum+num;
        }
        System.out.print(sum);    
    }
}





