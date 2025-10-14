/*19.Create a class Distance with data members (feet and inch).Write a program showing the concept of passing object in a function and add the data members of both the objects and find out the total feet and inches.*/
import java.util.Scanner;
class Distance {

    Scanner sc = new Scanner(System.in);
    private float feet;
    private float inch;

    void getData() {
        System.out.print("\nEnter the Feet value : ");
        this.feet = sc.nextFloat();
        System.out.print("Enter the Inch value : ");
        this.inch = sc.nextFloat();
    }

    void addData(Distance obj) {
        System.out.println("\nTotal Feet : "+(this.feet+obj.feet));
        System.out.println("Total Inch : "+(this.inch+obj.inch));
    }
    
    public static void main(String args[]) {
        
        Distance obj1 = new Distance();
        Distance obj2 = new Distance();

        obj1.getData();
        obj2.getData();

        obj1.addData(obj2);

    }
}