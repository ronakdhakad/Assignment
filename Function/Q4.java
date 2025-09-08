
//no argument with no return type
//function with recursion
//function calling itself
import java.util.Scanner;
class Fact{ 
    int fact( int n){
        if(n==0){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }   
}
class Exp{
    int exp(int b,int e){
        if(e==0){
            return 1;
        }else{
            return b*exp(b,e-1);
        }
    }
}
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();

        Fact obj =new Fact();
        System.out.println("factorial of "+n+" is: "+obj.fact(n));

        System.out.print("Enter base: ");
        int b=sc.nextInt();
        System.out.print("Enter exponient: ");
        int e=sc.nextInt();

        Exp obj2 =new Exp();
        System.out.println(b+"^"+e+" is: "+obj2.exp(b,e));
    }
}