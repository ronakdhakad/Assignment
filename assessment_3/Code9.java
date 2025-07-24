/*9. Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).*/
import java.util.Scanner;
class Code9{
    public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("enter a character: ");
    char chare = sc.next().charAt(0);

    if(chare >='a'&&chare<='z'){
        System.out.println("the character is  in lowercase");
    }else if(chare>='A'&&chare<='Z'){
        System.out.println("the character is in uppercase");
    }else{
        System.out.println("the character is not alphabet");
    }

    }
}
