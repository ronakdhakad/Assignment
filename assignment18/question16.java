/*16.Create a class TCSEmployee with data members name, eid, salary and companyName to store information of All TCS’s Employee records. Create functions which accept these members value and display them. Now u need to manage that companyName should be assign only once, no matter how
many number of object of this class created.
*/
import java.util.Scanner;
class TCSEmployee{
    String name;
    int eid;
    double salary;
    static String companyName;

    public static void setCompanyName(String compName){
        companyName = compName;
    }

    void acceptDetails(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Employee Name: ");
        name = scanner.nextLine();

        System.out.print("Enter Employee ID: ");
        eid = scanner.nextInt();

        System.out.print("Enter Salary: ");
        salary = scanner.nextDouble();
        scanner.nextLine();
    }

    void displayDetails(){
        System.out.println("\n####EMPLOYEE DETAILS####");
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + eid);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        TCSEmployee.setCompanyName("Tata Consultancy Services");

        TCSEmployee emp1 = new TCSEmployee();
        TCSEmployee emp2 = new TCSEmployee();

        emp1.acceptDetails();
        emp2.acceptDetails();

        emp1.displayDetails();
        emp2.displayDetails();
    }
}
