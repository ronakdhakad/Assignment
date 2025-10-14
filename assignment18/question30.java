/*30.Create a class Employee with one data member(name).Declare the member function 
a)Employee() :- initializes the data member.
b)getName() :- which gets the name. 
c)setName() :- which sets the name. 
d)pay(int hours_worked)
Create a class HourlyEmployee which takes two data members(name and wage).Use above member function. The pay method should calculate the hourly wage of an employee.
Create a class SalariedEmployee which takes two data members(name and wage).Use above member function. The pay method should calculate the hourly wage of an employee.
*/


import java.util.Scanner;
class Employee {
    Scanner sc = new Scanner(System.in);
    protected String name;

    Employee(String name) {
        this.name = name;
    }

    void getName() {
        System.out.print("Enter you Name : ");
        name = sc.nextLine();
    }

    void setName() {
        System.out.println("Set Name : ");
        name = sc.nextLine();
    }  

    int pay(int hours_worked) {
        System.out.print("Hourly pay : "+hours_worked/8);
    }
}

class HourlyEmployee extends Employee {
    String name;
    int wage;

    HourlyEmployee (String name) {
        super(name);
    }
    void getWage() {
        System.out.print("Enter wage : ");
    }

    void getWage() {
        System.out.print("Enter wage : ");
        wage = sc.nextInt();
    }
}

class SalariedEmployee extends Employee {
    String name;
    int wage;

    SalariedEmployee (String name) {
        super(name);
    }

    void getWage() {
        System.out.print("Enter wage : ");
        wage = sc.nextInt();
    }
}
class TestMain {
    public static void main(String[] args) {
        HourlyEmployee emp1 = new HourlyEmployee("sohan");
        SalariedEmployee emp2 = new SalariedEmployee("mohan");

    }
}