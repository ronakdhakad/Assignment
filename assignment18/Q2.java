import java.util.Scanner;
class Main {
     Scanner sc=new Scanner(System.in);
     int num1;
     int num2;
     public void init(){
         System.out.println("Enter two number for addition");
         num1=sc.nextInt();
         num2=sc.nextInt();
        System.out.println("Addition is : "+add(this.num1,this.num2));
     }
     int add(int num1,int num2){
        return num1+num2;
    }
public static void main(String[] args) {
       Main add=new Main();
       add.init();
    }
}