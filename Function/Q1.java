//no argument with no return type
// import java.util.Scanner;
class Addition{
       java.util.Scanner sc=new java.util.Scanner(System.in);
        //System.out.println("Enter two numbers: "); it works in inside the function
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c;
    void Sum(){
        c=a+b;
        System.out.println("Sum: "+c);
    }
}
class Main{
    public static void main(String args[]){
        Addition obj=new Addition();
        obj.Sum();
    }
}
