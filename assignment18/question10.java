/*10.Create a class Student with data member (rno, fees and static member totalFees).Create parameterized constructor  which update the totalFees and create member function which prints the total fees collected of all the students.*/
class Student{
    private int rno;
    private int fees;
    private static int totalFees;

    Student(int rno, int fees){
        this.rno = rno;
        this.fees = fees;
        totalFees += fees;
    }

    static void printTotalFees(){
        System.out.println("Total fees collected from all students: " + totalFees);
    }

    public static void main(String args[]){
        Student s1 = new Student(101, 2000);
        Student s2 = new Student(102, 3000);
        Student s3 = new Student(103, 2500);

        printTotalFees();
    }
}