import java.util.Scanner;
class A18{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N terms");
        int n=sc.nextInt();
        int num=2,sum=1;
        int multi=1;
        for(int i=1;i<=n;i++){
            System.out.print(multi+" ");
            multi=sum*num;
            num=sum;
            sum=multi;
        }
    }
}
