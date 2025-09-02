import java.util.Scanner;
class Demo{
    int addition(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        System.out.println("Enter power");
        int b=sc.nextInt();
        int a1=1;
        for(int i=1;i<=b;i++){
            a1=a1*a;
        }
        return a1;

    }
    
}
class Main{
    public static void main(String args[]){
        Demo obj =new Demo();
        System.out.println(obj.addition());
    }
}
