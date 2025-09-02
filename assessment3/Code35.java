import java.util.Scanner;
class Code35 {
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter character");
        char c=sc.next().charAt(0);


        if(c>='a'&& c<='z'|| c>='A' && c<='Z'){
            System.out.println(c+" is a alphabet");
        }else{
            System.out.println(c+"is not a alphabet");
        }

    
    }
    
}
