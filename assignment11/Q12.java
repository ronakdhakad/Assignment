import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch=sc.next().charAt(0);
        if(ch>=97&&ch<=122){
            System.out.println("Character is already in lowercase: |"+ch+"|");
        }else{
            char ch1=(char)(ch+32);
            System.out.println("Uppercase: |"+ch+"| to lowercase: |"+ch1+"|");
        }
    }
}