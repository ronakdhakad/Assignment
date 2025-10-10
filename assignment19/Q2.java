/*
2.Problem Statement:
Design a Java program to model a University system. 
The outer class should be University, and it should contain 
a non-static nested class called Department. 

Each department should have a name, a head of department, 
and a list of courses offered.

Additionally, create a static nested class called UniversityStats
hat provides utility methods like counting the total 
number of departments and listing all department names.

Requirements:
Outer Class: University
Fields: universityName, location
Method: addDepartment(String name, String head, List<String> courses)
Method: displayDepartments()

Inner Class: Department (non-static)
Fields: name, head, courses
Method: displayInfo()

Static Nested Class: UniversityStats
Method: getDepartmentCount(List<Department>)
Method: listDepartmentNames(List<Department>)

Expected Output Example:
University Name: TechVille University
Location: Pune

Departments:
- Computer Science (Head: Dr. Mehta)
  Courses: Data Structures, Algorithms, AI

- Mechanical Engineering (Head: Dr. Rao)
  Courses: Thermodynamics, Fluid Mechanics

*/

class University {
    String universityName;
    String location;
    Department[] departments = new Department[10];
    int deptCount = 0;

    University(String universityName, String location) {
        this.universityName = universityName;
        this.location = location;
    }

    void addDepartment(String name, String head, String[] courses) {
        departments[deptCount] = new Department(name, head, courses);
        deptCount++;
    }

    void displayDepartments() {
        System.out.println("University Name: " + universityName);
        System.out.println("Location: " + location + "\n");
        System.out.println("Departments:");
        for (int i = 0; i < deptCount; i++) {
            departments[i].displayInfo();
        }
    }

    class Department {
        String name;
        String head;
        String[] courses;

        Department(String name, String head, String[] courses) {
            this.name = name;
            this.head = head;
            this.courses = courses;
        }

        void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Head: " + head);
            System.out.print("Courses: ");
            for (int i = 0; i < courses.length; i++) {
                System.out.print(courses[i]);
                if (i < courses.length - 1) 
                    System.out.print(", ");
            }
            System.out.println("\n");
        }
    }

    static class UniversityStats {
        static int getDepartmentCount(Department[] departments, int deptCount) {
            return deptCount;
        }
        static void listDepartmentNames(Department[] departments, int deptCount) {
            System.out.println("Department Names:");
            for (int i = 0; i < deptCount; i++) {
                System.out.println(i+1 + " "+departments[i].name);
            }
        }
    }
}

class Test{
    public static void main(String[] args) {
        University uni = new University("TechVille University", "Pune");
        String[] csCourses = {"Data Structures", "Algorithms", "Operating Systems"};
        String[] eeCourses = {"Circuits", "Electromagnetics", "Signal Processing"};
        String[] meCourses = {"Thermodynamics", "Fluid Mechanics", "Machine Design"};

        uni.addDepartment("Computer Science", "Dr. Mehta", csCourses);
        uni.addDepartment("Electrical Engineering", "Dr. Anupam Sharma", eeCourses);
        uni.addDepartment("Mechanical Engineering", "Dr. Rao", meCourses);

        uni.displayDepartments();
        System.out.println("Total Departments: " + University.UniversityStats.getDepartmentCount(uni.departments, uni.deptCount));
        University.UniversityStats.listDepartmentNames(uni.departments, uni.deptCount);
    }
}