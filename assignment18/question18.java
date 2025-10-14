/*18.Create a class Max with one data member(v) and functions
a)getV(): which is use to read variable value
b)display() : to display value
c)check() : which return an object of Max class and find maximum value using one objects as argument.(use this keyword to return an object).
*/
import java.util.Scanner;
class Max {
    Scanner sc = new Scanner(System.in);
    int v;

    void getV(){
        System.out.println("Enter the value of V");
        v = sc.nextInt();
    }

    void displayV(){
        System.out.println("Value of V : "+v);
    }

    Max check(Max obj2) {
        if(this.v>obj2.v)
            return this;
        else    
            return obj2;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Max obj1 = new Max();
        Max obj2 = new Max();

        obj1.getV();
        obj2.getV();

        obj1.displayV();
        obj2.displayV();

        System.out.println("Maximum value : "+obj1.check(obj2).v);
    }

}