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

        float per=(sub1+sub2+sub3+sub4+sub5)/5f;
        if(per>=75&&per<=100)
            System.out.println("Percentage is lies between 75-100 :"+per);
        else
            System.out.println("Percentage is not lies between 75-100 :"+per);
    }
}