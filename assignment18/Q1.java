import java.util.Scanner;
class Main {
    Scanner sc=new Scanner(System.in);
    void showChoice(int num1,int num2){
     System.out.println("Enter your choice to perform arithmetic operation");
        System.out.println("+.Addition\n-.Substraction\n*.Multiplication\n/.Divide");
        char ch=sc.next().charAt(0);
        switch(ch){
            case '+':System.out.println("Addition : "+add(num1,num2));break;
            case '-':System.out.println("Substraction : "+subtract(num1,num2));break;
            case '*':System.out.println("Multiplication : "+mulitiply(num1,num2));break;
            case '/':System.out.println("Divide : "+divide(num1,num2));break;
            default:System.out.println("Invalid choice");
        }
    }
    int add(int num1,int num2){
        return num1+num2;
    }
    int subtract(int num1,int num2){
        return num1-num2;
    }
    int mulitiply(int num1,int num2){
        return num1*num2;
    }
    double divide(int num1,int num2){
        return (double) num1/num2;
    }
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
        Main obj =new Main();
        System.out.println("Enter two number");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        obj.showChoice(num1,num2);
    }
}