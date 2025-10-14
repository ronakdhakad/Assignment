/*43.Create an Abstract class Processor with int member variable data and method showData to display data value.
a.Create abstract method process() to define processing of member data.
b.Create a class Factorial using abstract class Processor to calculate and print factorial of a number by overriding the process method.
c. Create a class Circle using abstract class Processor to calculate and print area of a circle by overriding the process method Ask user to enter choice (factorial or circle area). Also ask data to work upon; Use Processor class reference to achieve this mechanism
*/
import java.util.Scanner;
abstract class Processor {
    int a;
    Processor(int a){
        this.a = a;
    }
    abstract void process();
    void showData(){
        System.out.println("A : "+a);
    }
}
class Factorial extends Processor {
    Factorial(int a) {
        super(a);
    }
    @Override
    void process(){
        this.a = a;
        float fact=1;
        for(int i=a ; i>0 ; i--)
        {
            fact *=i;
        }
        System.out.println("Factorial of "+a+" is : "+fact);
    }
}

class Circle extends Processor {
    Circle(int a){
        super(a);
    }
    @Override
    void process() {
        this.a = a;
        System.out.println("Area of Circle : "+(3.1413*a*a));
    }
}

class TestMain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Processor procs;

        System.out.println("Enter your choice..!!");
        System.out.println("1.  Factorial");
        System.out.println("2.  Circle");
        int n = sc.nextInt();
        switch(n){
            case 1 :{
                System.out.print("Enter a Number : ");
                int a = sc.nextInt();
                procs = new Factorial(a);
                procs.showData();
                procs.process();

            }
            break;
            case 2 :{
                System.out.print("Enter Radius : ");
                int a = sc.nextInt();
                procs = new Circle(a);
                procs.showData();
                procs.process();
            }
            break;
            default : System.out.println("Invalid Choice");
        }
    }
}