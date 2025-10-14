/*41. Create three classes Faculty (facultyid, salary)
FullTimeFaculty (basic, allowance) inherits class Faculty
PartTimeFaculty (hour, rate) inherits class Faculty

Create a method for accepting input in FullTimeFaculty and PartTimeFaculty, but salary should not be accepted. Salary is calculated on the basis of (basic+allowance) for FullTimeFaculty and (hour*rate) for PartTimeFaculty. Also create method in above classes to display faculty data.

Create another class(say XYZ) for main method and store 2 fulltime and 2 parttime faculty information. Also print their details.
*/
import java.util.Scanner;
class Faculty {
    Scanner sc = new Scanner(System.in);
    int facultyid, salary;

}
class FullTimeFaculty extends Faculty{
    int basic, allowance;

    void getData() {
        System.out.println("\n###FULL TIME FACULTY###");
        System.out.print("Enter Faculty Id : ");
        facultyid = sc.nextInt();
        System.out.print("Enter Basic Salary : ");
        basic = sc.nextInt();
        System.out.print("Enter allowance : ");
        allowance = sc.nextInt();

        salary = basic+allowance;
    }

    void display() {
        System.out.println("\n###FULL TIME FACULTY###");
        System.out.print(" Faculty Id : "+facultyid);
        System.out.print(" Salary : "+salary);  
    }

}
class PartTimeFaculty extends Faculty {
    int hour, rate;

void getData() {
        System.out.println("\n###PART TIME FACULTY###");
        System.out.print("Enter Faculty Id : ");
        facultyid = sc.nextInt();
        System.out.print("Ente working hour : ");
        hour = sc.nextInt();
        System.out.print("Enter rate per hour : ");
        rate = sc.nextInt();

        salary = hour*rate*30;
    }

     void display() {
        System.out.println("\n###PART TIME FACULTY###");
        System.out.print(" Faculty Id : "+facultyid);
        System.out.print(" Salary : "+salary);  
    }
}

class TestMain {
    public static void main(String argsp[]) {
        FullTimeFaculty fTime[] = new FullTimeFaculty[2];
        PartTimeFaculty pTime[] = new PartTimeFaculty[2];

        for(int i=0 ; i<fTime.length ; i++)
        {
            fTime[i] = new FullTimeFaculty();
            pTime[i] = new PartTimeFaculty();
            fTime[i].getData();
            pTime[i].getData();
        }

        for(int i=0 ; i<fTime.length ; i++)
        {
            fTime[i].display();
            pTime[i].display();
        }

       

    }
}