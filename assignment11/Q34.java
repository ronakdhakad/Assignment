import java.util.Scanner;
class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year");
        int year=sc.nextInt();

        String y=((year%4==0&&year%100!=0)||(year%400==0)) ? "is a leap year" : "is not leap year";
            System.out.println(year+" "+y);
    }
    
}
