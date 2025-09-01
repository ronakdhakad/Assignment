import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter days: ");
        int days=sc.nextInt();
        int temp=days;
        int year=0;
        int week=0;
        int day=0;
        while(days!=0){
            if(days>=365){
                year++;
                days=days-365;
            }else if(days>=7){
                week++;
                days=days-7;
            }else{
                day++;
                days=days-1;
            }
        }
        System.out.println(temp+" days have "+year+" year, "+week+" week, "+day+" day");
    }
}