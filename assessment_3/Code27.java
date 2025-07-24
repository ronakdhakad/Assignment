import java.util.Scanner;
class Code27{

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a character");
        char n =sc.next().toLowerCase().charAt(0);

            switch(n){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(n+" is a vowel");
                    break;
                default :
                    System.out.println(n+" is not a vowel");
            }


    }
    
}
