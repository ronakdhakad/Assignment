/*26.Create a class Employee with two protected data member (name, payRate).
Declare two member function
a)void getName() :- which accepts name.
b)float getPay() :- which accepts the pay.
Create a class Manager with one data member is_salaried (which should be in the form of 0(false) or 1(true).
Declare one member function
a)int is_salaried() :- which returns whether the manager is salaried or not. b)showDetail() :- it display the entire detail of a employee.
*/
import java.util.Scanner;
class Employee {
    Scanner sc = new Scanner(System.in);
    protected String name;
    protected float payRate;

    void getName() {
        name = sc.nextLine();
    }

    float getPay() {
        payRate = sc.nextFloat();
        return payRate;
    }
}

class Manager extends Employee {
    private int is_salaried;

    void setIsSalaried(int val) {
        is_salaried = val;
    }

    int is_salaried() {
        return is_salaried;
    }

    void showDetail() {
        System.out.println("\n\n###EMPLOYEE DETAILS###");
        System.out.println("Name: " + name);
        System.out.println("Pay Rate: " + payRate);
        System.out.println("Is Salaried: " + (is_salaried == 1 ? "Yes" : "No"));
    }
}

class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager mngr = new Manager();

        System.out.print("Enter name: ");
        mngr.getName();
        System.out.print("Enter pay rate: ");
        mngr.getPay();
        System.out.print("Enter 1 if Salaried if not 0 : ");
        mngr.setIsSalaried(sc.nextInt());

        mngr.showDetail();
    }
}

