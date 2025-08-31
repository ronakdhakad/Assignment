import java.util.Scanner;
class A8 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range ");
        int n=sc.nextInt();
        int sum;
        int i=0;
        int j=1;
        System.out.print(" "+i+" "+j);
        for(int a=0;a<n;a++){
            sum=i+j;
            i=sum-i;
            j=sum;
            System.out.print(" "+sum);
        }
    }
}
