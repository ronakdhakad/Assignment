/*23.Create three classes
Faculty (facultyname, department, salary) 
FullTimeFaculty (basic, allowance) inherits class Faculty 
PartTimeFaculty (hour, rate) inherits class Faculty

Create a function for accepting input for FullTimeFaculty and PartTimeFaculty but salary should not be accepted. Salary is calculated on the basis of (basic+allowance) for FullTimeFaculty and (hour*rate) for PartTimeFaculty. Also create function for displaying data for any faculty.
*/
//Faculty (facultyname, department, salary) 
import java.util.Scanner;
class Faculty {
    Scanner sc = new Scanner(System.in);
    protected String facultyname;
    protected String department;
    protected int salary;

    void getDetail() {
        System.out.print("\nEnter Faculty Name : ");
        facultyname = sc.nextLine();
        System.out.print("Enter Department   : ");
        department = sc.nextLine();
    }
    void show() {
        System.out.println("\n\n     ####FACULTY DETAIL'S####");
        System.out.println("\tName       : "+facultyname);
        System.out.println("\tDepartment : "+department);
        System.out.println("\tSalary     : "+salary);
    }

}
class FullTimeFaculty extends Faculty {
    private int basic;
    private int allowance;
    
    void getData() {
        System.out.println("\n##FULL TIME FACULTY##");
        getDetail();
        System.out.print("Enter Basic Salary : ");
        basic = sc.nextInt();
        System.out.print("Enter Allowance    : ");
        allowance = sc.nextInt();
        salary = basic + allowance;
    }
}
class PartTimeFaculty extends Faculty {
    private int hour;
    private int rate;

    void getData() {
        System.out.println("\n##FULL TIME FACULTY##");
        getDetail();
         System.out.print("Enter working Hour : ");
        hour = sc.nextInt();
        System.out.print("Enter Rate per Hour : ");
        rate = sc.nextInt();
        salary = hour*rate*30;
    }
}

class TestMain {
    public static void main(String[] args) {
        FullTimeFaculty obj = new FullTimeFaculty();
        PartTimeFaculty obj1 = new PartTimeFaculty();

        obj.getData();
        obj.show();

        obj1.getData();
        obj1.show();
    }
}
