import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch=sc.next().charAt(0);
        if(ch>=65&&ch<=90){
            System.out.println("Character is already in uppercase: |"+ch+"|");
        }else{
            char ch1=(char)(ch-32);
            System.out.println("Lowercase: |"+ch+"| to uppercase: |"+ch1+"|");
        }
    }
}