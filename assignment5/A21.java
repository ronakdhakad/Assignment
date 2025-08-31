import java.util.Scanner;
class A21{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N terms");
        int n=sc.nextInt();
        int square;
        for(int i=0;i<n;i++){
            square=i*i;
            System.out.print(square+" ");
        }
    }
}

