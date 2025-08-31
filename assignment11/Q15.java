import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch=sc.next().charAt(0);

        String s=(ch>=65&&ch<=90) ? "Character is uppercase" : "Character is not in uppercase" ;
        System.out.println(s);
    }
}