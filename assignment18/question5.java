import java.util.Scanner;
class TEST 
{     
    private int TestCode;
    private String Description;
    private int Candidates;    
    private int CenterReqd;     

    private int calcCenter() 
    {
        return (Candidates + 49) / 50; 
    }
    public void schedule() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Test Code (integer): ");
        TestCode = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Description: ");
        Description = sc.nextLine();
        System.out.print("Enter Number of Candidates: ");
        Candidates = sc.nextInt();
        CenterReqd = calcCenter();
    }
     public void displayTest() 
     {
        System.out.println("Test Code      : " + TestCode);
        System.out.println("Description    : " + Description);
        System.out.println("Candidates     : " + Candidates);
        System.out.println("Centers Needed : " + CenterReqd);
    }

    public static void main(String[] args) 
    {
        TEST obj = new TEST();
        obj.schedule();
        obj.displayTest();
    }
}

