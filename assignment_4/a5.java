import java.util.Scanner;
class A{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();

        int i=1;
        int sum=0;

        while(i<=n){
            if(i%2==0){
                sum=sum-i;
                i++;
            }else{     
                sum=sum+i;
                i++;
            }
        }
        System.out.println("Sum of  1 - 2 + 3 - 4 + 5 - 6 ...."+n+".. is "+sum);

    }    
}
