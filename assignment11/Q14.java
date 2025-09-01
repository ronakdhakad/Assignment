import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of five subjects: ");
        int sub1=sc.nextInt();
        int sub2=sc.nextInt();
        int sub3=sc.nextInt();
        int sub4=sc.nextInt();
        int sub5=sc.nextInt();
        
        int total=sub1+sub2+sub3+sub4+sub5;
        float per=total/5f;
        System.out.println("Total marks of subject: "+total);
        System.out.println("Percentage :"+per);
    }
}