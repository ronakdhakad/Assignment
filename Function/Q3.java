//with argument with no return type
import java.util.Scanner;
class Table{
        int i=1;
        int t;
    void table( int n){
        System.out.println("Table of "+n+" :-");
        while(i<=10){
            t=n*i;
            System.out.println(n+" X "+i+" = "+t);
            i++;
        }
    }   
}
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();

        Table obj =new Table();
        obj.table(n);
    }
}