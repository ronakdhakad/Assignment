/*42. Create a class Student with two members : rollno and percentage.
Create default and parameterized constructors. Create method show() to display information.
Create another class CollegeStudent inherits Student class. Add a new member semester to it. Create default and parameterized constructors. Also override show() method.

Create another class SchoolStudent inherits Student class. Add a new member classname(eg 12 th ,10 th etc.) to it. Create default and parameterized constructors. Also override show() method.

Create a class(say XYZ) with main method that carries out the operation of the
project :
-- has array to store objects of any class(Student or CollegeStudent,SchoolStudent)
--create two CollegeStudent and three SchoolStudent record objects and store them inside the array
-- display all record from the array
-- search record on the basic of rollno and check given rollno is of SchoolStudent or of CollegeStudent.--count how many students are having A grade, if for A grade percentage >75
*/
import java.util.Scanner;
class Student {
    int rollno;
    float percentage;

    Student() {}

    Student(int rollno, float percentage) {
        this.rollno = rollno;
        this.percentage  = percentage;
    }

    void show() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Percentage: " + percentage + "%");
    }
}

/*Create another class CollegeStudent inherits Student class. Add a new member semester to it. Create default and parameterized constructors. Also override show() method.*/
class CollegeStudent extends Student{
    int semester;

    CollegeStudent() {
        semester = 0;
    }
    CollegeStudent(int rollno, float percentage, int semester) {
        super(rollno, percentage);
        this.semester = semester;
    }

    @Override
    void show() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Semester: "+semester);
    }
}

class SchoolStudent extends Student{
    int classname;

    SchoolStudent() {
        classname = 0;
    }
    SchoolStudent(int rollno, float percentage, int classname) {
        super(rollno, percentage);
        this.classname = classname;
    }

    @Override
    void show() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("classname: "+classname+"th");
    }
}

class XYZ {
    public static void main(String argsp[]) {
        Scanner sc = new Scanner(System.in);
        Student college[] = new Student[2];
        Student school[] = new Student[3];
        int rollno;
        float percentage;
        int semester;
        int classname;
        //COLLEGE STUDENT DATA
        for(int i=0 ; i<college.length ; i++){
            System.out.println("\n##ENTER COLLEGE STUDENT DETAIL");
            while(true){
                System.out.print("Enter Roll No : ");
                rollno = sc.nextInt();
                int count=0;
                for(int j=0 ; college[j]!=null ; j++)
                {
                    if(rollno==college[j].rollno){
                        System.out.println("Duplicate not allowed");
                        count++;
                    }
                }
                if(count==0)
                    break;
            }
            while(true){
                System.out.print("Enter Percentage : ");
                percentage = sc.nextFloat();
                if(percentage<=100)
                    break;
                else
                    System.out.println("Enter Valid Percentage");
            }
            while(true) {
                 System.out.print("Enter Semester : ");
                semester = sc.nextInt();
                if(semester>0&&semester<=8)
                    break;
                 else
                    System.out.println("Enter VAlid Semester");
            }
            college[i] = new CollegeStudent(rollno, percentage, semester);
        }   

        rollno=0;
        percentage=0;
        //SCHOOL STUDENT DATA
        for(int i=0 ; i<school.length ; i++){
            System.out.println("\n##ENTER SCHOOL STUDENT DETAIL");
            while(true){
                System.out.print("Enter Roll No : ");
                rollno = sc.nextInt();
                int count=0;
                for(int j=0 ; school[j]!=null ; j++)
                {
                    if(rollno==school[j].rollno){
                        System.out.println("Duplicate not allowed");
                        count++;
                    }
                }
                if(count==0)
                    break;
            }            while(true){
                System.out.print("Enter Percentage : ");
                percentage = sc.nextFloat();
                if(percentage<=100)
                    break;
                else
                    System.out.println("Enter Valid Percentage");
            }
            while(true) {
                System.out.print("Enter class Name : ");
                classname = sc.nextInt();
                if(classname>0&&classname<=12)
                    break;
                else
                    System.out.println("Enter VAlid class Name");
            }
            school[i] = new SchoolStudent(rollno, percentage, classname);
        }   

        System.out.println("-----------------------------------------------------");
        //COLLEGE STUDENT DATA DISPLAY
        for(int i=0 ; i<college.length ; i++){
            System.out.println("\n##COLLEGE STUDENT "+(i+1)+" ##");
            college[i].show();
        }   

        //SCHOOL STUDENT DATA DISPLAY
        for(int i=0 ; i<school.length ; i++){
            System.out.println("\n##SCHOOL STUDENT "+(i+1)+" ##");
            
            school[i].show();
        }   

        /*-- search record on the basic of rollno and check given rollno is of SchoolStudent or of CollegeStudent.--count how many students are having A grade, if for A grade percentage >75*/
        System.out.println("-----------------------------------------------------");
        System.out.println("\n\nEnter the roll Number which you want to search..");
        int roll = sc.nextInt();
        String existIn="null";
        for(int i=0 ; i<(school.length) ; i++){
            if(roll==school[i].rollno){
                existIn = "School Student";
                break;
            } else
                existIn = "Record not found..!!";
        }
        String existInc="null";
        for(int i=0 ; i<(college.length) ; i++){
            if(roll==college[i].rollno){
                existInc = "College Student";
                break;
            } else 
                existInc = "Record not found..!!";
        }
        System.out.println("Roll Number In College  : "+roll+"\n "+existInc);
        System.out.println("Roll Number In School : "+roll+"\n "+existIn);

        System.out.println("-----------------------------------------------------");
        System.out.println("\n");
        int count=0;
        for(int i=0 ; i<(school.length) ; i++){
            if(school[i].percentage>75.0){
                count++;
            }
            if(i<college.length&&college[i].percentage>75.0){
                count++;
            }
        }
        
        if(count>0)
            System.out.println("Total "+count+" Students have a Grade in college and School");
        else
            System.out.println("No one can have A grade");

         System.out.println("\n");
    }
}