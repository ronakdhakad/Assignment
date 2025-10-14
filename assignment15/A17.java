import java.util.Scanner;
class A17{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N terms");
        int n=sc.nextInt();
        int sum=1;
        for(int i=0;i<n;i++){
            sum=sum+i;
            System.out.print(sum+" ");
        }
    } 
}
