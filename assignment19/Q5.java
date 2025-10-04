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
        String title;
        String instructor;
        String student;
        void course(){
            System.out.print("Course Name:");
            c=sc.nextLine();
            System.out.print("Course Title:");
            t=sc.nextLine();
            System.out.print("Instructor:");
            i=sc.nextLine();
        }
            void students(){
                System.out.println("Students of "+c+" course");
                System.out.println();
            }
        void details(){
            System.out.println();
            System.out.println("course\ttitle\tinstructor");
            System.out.println(c+"\t"+t+"\t"+i);
        }
    }
    static class PlatformStats{
        for 
    }
}
class Main extends CoursePlatform{
    public static void main(String args[]){
        Scanner sc =new Scanner (System.in);
        System.out.println();
        
        CoursePlatform cobj= new CoursePlatform();
        Course carry[]=new Course[3];
        for(int i=0;i<carry.length;i++){
            carry[i]=cobj.new Course();
            carry[i].course();
        }
        for(Course c1:carry){
            c1.details();
        }


    }
}
