// Employee Record System
// Create a class Employee with private fields:
//id, name, and salary.
// Use setter methods to assign values.
//Add a method to display employee details.
import java.util.Scanner;
public class Employee{
        private String id;
        private String name;
        private int salary;
    
    public void setData(String id , String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public void getData(){
        System.out.println("Employee ID: "+id);
        System.out.println("Employee NAME: "+name);
        System.out.println("Employee SALARY: "+salary);
    }
}
class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        Employee em=new Employee();
        System.out.println("Enter the data :- String id , String name, int salary");
        em.setData(sc.next(),sc.next(),sc.nextInt());
        em.getData();
    }
}