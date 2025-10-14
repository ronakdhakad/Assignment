import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int count=1;
        for(int i=1;i<=n;i++){
            n=n/10;
            if(n==0){
                break;
            }else{
            }
            count++;
        }

        System.out.print("No of digits is "+count);
    }
}




