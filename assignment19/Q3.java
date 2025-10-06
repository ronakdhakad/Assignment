/*3. Employee Management System
Create a class Company that contains a non-static nested class Employee. Each Employee should
 have fields like name, id, and designation. The Company class should maintain a list of employees
  and provide methods to:
Add a new employee
Display all employees
Search for an employee by ID
Add a static nested class CompanyPolicy that contains static methods to:
Validate employee designation
Enforce minimum working hours */
import java.util.Scanner;
 class Company{
    Scanner sc=new Scanner(System.in);
    public class Employee{
        String name;
        int id;
        String designation;
        void addEmp(){
            System.out.println("Employee Name: ");
            name=sc.nextLine();
            System.out.println("Employee Id: ");
            id=sc.nextInt();
            sc.nextLine();
            System.out.println("Designation: ");
            designation=sc.nextLine();  
        }
        void display(){
            System.out.println("\t"+name+"\t"+id+"\t"+designation);
        }
    }
 }
 class Main extends Company{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Empoyee: ");
        int size=sc.nextInt();
        Company c= new Company();
        Employee e[]=new Employee[size];
        int i=0;

            for(int j=0;j<e.length;j++){
                e[j]= c.new Employee();
                e[j].addEmp();
            }
            for(Employee e1 :e){
                e1.display();
            }
            System.out.println("Enter Employee Id: ");
            int sid=sc.nextInt();
            for(int k=0;k<e.length;k++){
                if(sid==e[k].id){
                    e[k].display();
                    // System.out.println("Enter Number of Empoyee: ");
                }
            }
    }

 }