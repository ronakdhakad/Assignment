import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int sum=0;
            for (int i=1;i<n;i++){
                if(n%i==0){
                    sum=sum+i;
                }else if (n-1==i){
                    System.out.print(n+" is not a perfect number");
                    break;
                }else if(sum==n){
                    System.out.print(n+" is perfect number");
                    break;  
                }
            }
    }
}




