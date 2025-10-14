/*37. Make list of Students having name, roll no., age, score. Write a program to accept 10 students record and arrange the Students based on the score group [0-50], [50-65],[65-80],[80-100].
*/
import java.util.Scanner;
class Student {
    String name;
    int rollNo;
    int age;
    double score;

    public Student(String name, int rollNo, int age, double score) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.score = score;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Age: " + age + ", Score: " + score);
    }
}

class TestMain
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Roll No: ");
            int roll = sc.nextInt();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Score: ");
            double score = sc.nextDouble();
            sc.nextLine();

            students[i] = new Student(name, roll, age, score);
        }

        System.out.println("\nStudents with score 0-50:");
        for (Student s : students) {
            if (s.score >= 0 && s.score < 50)
                s.display();
        }

        System.out.println("\nStudents with score 50-65:");
        for (Student s : students) {
            if (s.score >= 50 && s.score < 65)
                s.display();
        }

        System.out.println("\nStudents with score 65-80:");
        for (Student s : students) {
            if (s.score >= 65 && s.score < 80)
                s.display();
        }

        System.out.println("\nStudents with score 80-100:");
        for (Student s : students) {
            if (s.score >= 80 && s.score <= 100)
                s.display();
        }
    }
}

