import java.util.Scanner;
class Test {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        char s=sc.next().charAt(0);

        if(s>='A'&&s<='Z'){
            System.out.println(s+" is uppercase charecter");
        }else if(s>='a'&&s<='z'){
            System.out.println(s+" is lowercase charecter");
        }else if(s>=0&&s<=9){
            System.out.println(s+" is integer value");
        }else{
            System.out.println(s+"Invalid number ");
        }
        System.out.println(s);



    }
    
}
