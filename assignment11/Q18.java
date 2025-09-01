import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch=sc.next().charAt(0);

        char s=(ch>=65&&ch<=90) ? (char)(ch+32) :ch ;
        if(s==ch)
            System.out.println("Character is already in lowercase");
        else
            System.out.println("Uppercase |"+ch+"| to lowercase: |"+s+"|");
    }
}