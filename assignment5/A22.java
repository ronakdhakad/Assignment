import java.util.Scanner;
class A22{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N terms");
        int n=sc.nextInt();
        int cube;
        for(int i=0;i<n;i++){
            cube=i*i*i;
            System.out.print(cube+" ");
        }
    }
}

