import java.util.Scanner;
class Main{
    public static final String RESET = "\u001B[0m";
    public static final String BOLD = "\u001B[1m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    public static final String BLACK = "\u001B[30m";

    public static final String BLACK_BACKGROUND = "\u001B[40m";
    public static final String RED_BACKGROUND = "\u001B[41m";
    public static final String GREEN_BACKGROUND = "\u001B[42m";
    public static final String YELLOW_BACKGROUND = "\u001B[43m";
    public static final String BLUE_BACKGROUND = "\u001B[44m";
    public static final String PURPLE_BACKGROUND = "\u001B[45m";
    public static final String CYAN_BACKGROUND = "\u001B[46m";
    public static final String WHITE_BACKGROUND = "\u001B[47m";
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Student Name: ");
        String name=sc.nextLine();
        System.out.print("Gender: ");
        String sex=sc.nextLine();
        System.out.print("Father's Name: ");
        String fname=sc.nextLine();
        System.out.print("Mother's Name: ");
        String mname=sc.nextLine();
        System.out.print("Enrollment No.: ");
        String enrollNo =sc.nextLine();
        System.out.print("Roll No: ");
        int rollNo= sc.nextInt();
        System.out.print("Status: ");
        String status=sc.nextLine();
        sc.nextLine();
        System.out.print("Enter major Subject: ");
        String sub1=sc.nextLine();
        System.out.print("Enter Grade of "+sub1+" out of 75 is: ");
        int subNo1=sc.nextInt();
        System.out.print("Enter practical marks of "+sub1+" out of 25: ");
        int practical1=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter minor Subject: ");
        String sub2=sc.nextLine();
        System.out.print("Enter Grade of "+sub2+" out of 75 is: ");
        int subNo2=sc.nextInt();
        System.out.print("Enter practical marks of "+sub2+" out of 25: ");
        int practical2=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter vocational-I Subject: ");
        String sub3=sc.nextLine();
        System.out.print("Enter Grade of "+sub3+" out of 75 is: ");
        int subNo3=sc.nextInt();
        System.out.print("Enter practical marks of "+sub3+" out of 25: ");
        int practical3=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter vocational-II Subject: ");
        String sub4=sc.nextLine();
        System.out.print("Enter Grade of "+sub4+" out of 75 is: ");
        int subNo4=sc.nextInt();
        System.out.print("Enter practical marks of "+sub4+" out of 25: ");
        int practical4=sc.nextInt();
        sc.nextLine();
         System.out.print("Enter open-elective Subject: ");
        String sub5=sc.nextLine();
        System.out.print("Enter Grade of "+sub5+" out of 75 is: ");
        int subNo5=sc.nextInt();
        System.out.print("Enter practical marks of "+sub5+" out of 25: ");
        int practical5=sc.nextInt();

        int marks1=subNo1+practical1;
        int marks2=subNo2+practical2;
        int marks3=subNo3+practical3;
        int marks4=subNo4+practical4;
        int marks5=subNo5+practical5;
        int totalNo= subNo1+subNo2+subNo3+subNo4+subNo5;

        int totalMarks=marks1+marks2+marks3+marks4+marks5;
        int totalPractical=practical1+practical2+practical3+practical4+practical5;

        double sgpa=(double) (totalMarks/(5*10f));
        double cgpa=sgpa;

        int count=0;

        if(marks1<=33){
            count++;
        }
        if(marks2<=33){
            count++;
        }
        if(marks3<=33){
            count++;
        }
        if(marks4<=33){
            count++;
        }
        if(marks5<=33){
            count++;
        }
        
        String result="PASS";
        if(count==0){
            result="PASS";
        }else if(count>=1){
            if(count>=3)
                result="YEAR BACK";
            else
                result="ATKT";
        }

        String grade;
        if(sgpa>=9){
            grade="A+";
        }else if(sgpa>=8){
            grade="A";
        }else if(sgpa>=7){
            grade="B+";
        }else if(sgpa>=6){
            grade="B";
        }else if(sgpa>=5){
            grade="C";
        }else if(sgpa>=4){
            grade="P";
        }else{
            grade="F";
        }
        System.out.println("");
        System.out.println(WHITE_BACKGROUND+"                                                                  "+RESET);
        System.out.println(WHITE_BACKGROUND+BLACK+BOLD+"    Govt.(Model,Autonomous)Holkar Science College,Indore(M.P.)    "+RESET);
        System.out.println(WHITE_BACKGROUND+RED+"                           GRADE SHEET                            "+RESET);
        System.out.println(WHITE_BACKGROUND+BLACK+"        BCA IV semester main examination may -june 2025           "+RESET);
        System.out.println(WHITE_BACKGROUND+"__________________________________________________________________"+RESET);
        System.out.println(GREEN_BACKGROUND+"                                                                  "+RESET);
        System.out.printf(GREEN_BACKGROUND+"%-40s%-25s%5s%n","Enrollment No: "+enrollNo,"Name: "+name," "+RESET);
        System.out.printf(GREEN_BACKGROUND+"%-40s%-25s%5s%n","Roll No: "+rollNo,"Father's Name: "+fname," "+RESET);
        System.out.printf(GREEN_BACKGROUND+"%-40s%-25s%5s%n","Status: "+status,"Mother's Name: "+mname," "+RESET);
        System.out.println(GREEN_BACKGROUND+"__________________________________________________________________"+RESET);
        System.out.println(BLUE_BACKGROUND+"                                                                  "+RESET);
        System.out.printf(BLACK+BLUE_BACKGROUND+"%10s%15s%20s%20s%5s%n","SUBJECT","MARKS","PRACTICAL","TOTAL"," "+RESET);
        System.out.printf(YELLOW_BACKGROUND+CYAN+"%-10s%15s%20s%20s%-10s%n",sub1,subNo1,practical1,marks1," "+RESET);
        System.out.printf(YELLOW_BACKGROUND+CYAN+"%-10s%15s%20s%20s%-10s%n",sub2,subNo2,practical2,marks2," "+RESET);
        System.out.printf(YELLOW_BACKGROUND+CYAN+"%-10s%15s%20s%20s%-10s%n",sub3,subNo3,practical3,marks3," "+RESET);
        System.out.printf(YELLOW_BACKGROUND+CYAN+"%-10s%15s%20s%20s%-10s%n",sub4,subNo4,practical4,marks4," "+RESET);
        System.out.printf(YELLOW_BACKGROUND+CYAN+"%-10s%15s%20s%20s%-10s%n",sub5,subNo5,practical5,marks5," "+RESET);
        System.out.printf(RED_BACKGROUND+BLACK+"%-10s%15s%20s%20s%-10s%n"," ",totalNo,totalPractical,totalMarks," "+RESET);
        System.out.printf(BLUE_BACKGROUND+BLACK+"%-10s%15s%20s%20s%-10s%n","RESULT:",result,"SGPA:",sgpa," "+RESET);
        System.out.printf(BLUE_BACKGROUND+BLACK+"%-10s%15s%20s%20s%-10s%n","GRADE:",grade,"CGPA:",cgpa," "+RESET);

    }
}
