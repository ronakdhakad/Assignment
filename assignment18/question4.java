import java.util.Scanner;
class Student 
{
    private int admno;
    private String sname;
    private float eng, math, science;
    private float total;

    private float ctotal() 
    {
        return eng + math + science;
    }

    public void takeData() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Admission Number: ");
        admno = sc.nextInt();
        sc.nextLine();  
        System.out.print("Enter Student Name: ");
        sname = sc.nextLine();
        System.out.print("Enter English marks: ");
        eng = sc.nextFloat();
        System.out.print("Enter Maths marks: ");
        math = sc.nextFloat();
        System.out.print("Enter Science marks: ");
        science = sc.nextFloat();
        total = ctotal();
    }
    public void showData() 
    {
        System.out.println("\nAdmission Number: " + admno);
        System.out.println("Student Name: " + sname);
        System.out.println("English: " + eng);
        System.out.println("Math: " + math);
        System.out.println("Science: " + science);
        System.out.println("Total: " + total);
    }
    public static void main(String[] args) 
    {
        Student st = new Student();
        st.takeData();
        st.showData();
    }
}

