import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch=sc.next().charAt(0);

        String s=((ch>=65&&ch<=90)||(ch>=97&&ch<=122)) ? "Character is alphabet" : "Character is not alphabet" ;
        System.out.println(s);
    }
}