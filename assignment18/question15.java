/*15.	Create a class Student (rollno, name) which keeps track of how many objects are created of the class. Every time object of the class is created, it should display number of total objects created.*/
class Student {
    int rollno;
    String name;
    static int count = 0;

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
        count++;
        System.out.println("Total objects created: " + count);
    }

    public static void main(String[] args) {
        Student obj1 = new Student(101, "Sohan");
        Student obj2 = new Student(102, "Mohan");
        Student obj3 = new Student(103, "Sita");
        Student obj4 = new Student(104, "Gita");
    }
}

