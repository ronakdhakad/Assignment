import java.util.Scanner;
class Code33 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();
        if((n & 1)==0){
            System.out.println(n+" is a even number");
        }else{
            System.out.println(n+" is a odd number");       
        }
    }
    
}
