// example showing the concept of function
// this keyword is used to represent current class data member

import java.util.Scanner;
class Main{
    int a,b; // instance variable 
    void setData(int a,int b){
        this.a = a;
        this.b = b;
    }
    void add(){
        System.out.println("Add : "+(a+b));
    }
    void sub(){
        System.out.println("Sub : "+(a-b));
    }
    void mul(){
        System.out.println("Mul : "+(a*b));
    }
    void div(){
        System.out.println("Div : "+(a/b));
    }
    void mod(){
        System.out.println("Mod : "+(a%b));
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Main obj = new Main();
        obj.setData(a,b);
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
        obj.mod();
    }
}