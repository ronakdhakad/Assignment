import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter height of person in feet: ");
        int feet=sc.nextInt();
        float meter=feet*0.3048f;
        System.out.println("Height of person in meters is: "+meter+" meter");
    }
}