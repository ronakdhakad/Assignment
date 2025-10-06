// 5. Online Course Platform
// Create a class CoursePlatform with a nested class Course. 
// Each course should have a title, instructor, and list of 
// enrolled students. Implement methods to:
//     • Add a course
//     • Enroll a student
//     • Display course details
// Add a static nested class PlatformStats to:
//     • Count total courses
//     • List all instructors
    
import java.util.Scanner;
class CoursePlatform{
    Scanner sc =new Scanner (System.in);
    class Course{
        String i;
        String t;
        String c;
        String name;
        int size1;
        String student[];
        
        Course(int size1){
            this.size1=size1;
            student=new String[size1];
        }

        void course(){
            System.out.print("Course Name:");
            c=sc.nextLine();
            System.out.print("Course Title:");
            t=sc.nextLine();
            System.out.print("Instructor:");
            i=sc.nextLine();
            System.out.println("Name of Students in "+c+" course");
                for(int i=0;i<size1;i++){
                    student[i]=new String();
                    student[i]=sc.nextLine();
                }
        }
            void sdetails(){
                    for(int i=0;i<size1;i++){
                        System.out.println((i+1)+".  "+student[i]);
                    }
                    System.out.println();
            }
        void details(){
            System.out.println();
            System.out.println("course\t\t\ttitle\t\t\tinstructor");
            System.out.println(c+"\t\t"+t+"\t\t"+i);
            System.out.println("Student List ...");
            sdetails();
        }
    }
    static class PlatformStats{
        static void list(Course[] course){
            System.out.println("Instructors: ");
            for(Course s:course){
                System.out.println(s.i);
            }
        }
    }
}
class Main extends CoursePlatform{
    public static void main(String args[]){
        Scanner sc =new Scanner (System.in);
        System.out.println();
        
        System.out.println("Number of courses");
        int size=sc.nextInt();
        System.out.println("Number of Students in each course");
        int size1=sc.nextInt();

        CoursePlatform cobj= new CoursePlatform();
        Course carry[]=new Course[size];

        for(int i=0;i<carry.length;i++){
            carry[i]=cobj.new Course(size1);
            carry[i].course();
        }

        for(Course c1:carry){
            c1.details();
        }
        PlatformStats.list(carry);
    }
}
