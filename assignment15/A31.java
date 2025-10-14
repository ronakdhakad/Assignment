import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N terms");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(9);
            }
            System.out.print(" ");    
        }
    }
}
