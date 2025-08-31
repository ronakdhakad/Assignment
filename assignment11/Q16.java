import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch=sc.next().charAt(0);

        String s=(ch>=97&&ch<=122) ? "Character is lowercase" : "Character is not in lowercase" ;
        System.out.println(s);
    }
}