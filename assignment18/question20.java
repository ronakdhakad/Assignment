/*20.Create a class Distance with data members (feet and inch).Write a program showing the concept of passing object in a function and returning object from a function (add the data members of both the objects and find out the total feet and inches).*/
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

    Distance addData(Distance obj, Distance objAdd) {
        objAdd.feet = this.feet + obj.feet;
        objAdd.inch = this.inch + obj.inch;

        return objAdd;
    }
    
    public static void main(String args[]) {
        
        Distance obj1 = new Distance();
        Distance obj2 = new Distance();
        Distance objAdd = new Distance();

        obj1.getData();
        obj2.getData();

        objAdd = obj1.addData(obj2, objAdd);

        System.out.println("\nTotal Feet : "+objAdd.feet);
        System.out.println("Total Inch : "+objAdd.inch);

    }
}