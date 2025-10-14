/*35. Create a class Employee with(empNo ,salary and totalSalary) ) with following features.
a. Only parameterized constructor;
b. totalSalary always represent total of all the salaries of all employees created.
c. empNo should be auto incremented.
d. display total employees and totalSalary using class method.
*/
class Employee {
    private int empNo;
    private double salary;
    private static int count = 0;
    private static double totalSalary = 0;

    public Employee(double salary) {
        count++;               
        this.empNo = count;  
        this.salary = salary;
        totalSalary += salary; 
    }
    public void display() {
        System.out.println("Employee No: " + empNo + ", Salary: " + salary);
    }


    public static void showTotals() {
        System.out.println("Total Employees: " + count);
        System.out.println("Total Salary of all employees: " + totalSalary);
    }
}


class TestMain 
{
    public static void main(String[] args) {
        Employee e1 = new Employee(25000);
        Employee e2 = new Employee(30000);
        Employee e3 = new Employee(40000);

        e1.display();
        e2.display();
        e3.display();

        
        Employee.showTotals();
    }
}

