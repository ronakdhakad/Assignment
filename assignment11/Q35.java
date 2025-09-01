import java.util.Scanner;
class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int result=num<<1;
        System.out.println("Multiply by 2 is: "+result);
    }
}
