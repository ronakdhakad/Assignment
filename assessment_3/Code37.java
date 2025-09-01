import java.util.Scanner;
public class Code37 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number");
        int a=sc.nextInt();
        
        if(((a % 5==0) &&(a  % 11==0))){
            System.out.println(a+" is divisible by both 5 and 11");
        }else{
            System.out.println(a+" is not divisible by both 5 and 11");
        }

    }
    
}
