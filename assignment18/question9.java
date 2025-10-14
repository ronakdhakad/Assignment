/*9.Create a class Employee with members (empid, salary).Create following functions
a)calcTax() with employee object as argument and print tax on salary with 12.5% tax rate;
b)max() which accepts two employee as objects and return the employee with higher salary
*/
import java.util.Scanner;
class Employee{
    Scanner sc = new Scanner(System.in);
    private int empid;
    private int salary;
    void getData(){
        System.out.print("Enter Employee Id     : ");
        empid = sc.nextInt();
        System.out.print("Enter Employee Salary : ");
        salary = sc.nextInt();

    }
    void calcTax(Employee obj){
        float tax =(float)(obj.salary*12.5/100);
        System.out.println("Salary : "+obj.salary+"\nTax(12.5%) : "+tax);
    }
    void display()
    {
        System.out.println("Employee Id     : "+empid);
        System.out.println("Employee Salary : "+salary);
    }
    static Employee max(Employee obj1, Employee obj2){
        return (obj1.salary>obj2.salary ? obj1 : obj2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Employee obj1 = new Employee();
        Employee obj2 = new Employee();

        obj1.getData();
        obj2.getData();

        obj1.calcTax(obj1);
        obj2.calcTax(obj2);

        Employee temp = max(obj1, obj2);
        System.out.println("##HIGHEST SALARY EMPLOYEE##");
        temp.display();
    }   
}
 