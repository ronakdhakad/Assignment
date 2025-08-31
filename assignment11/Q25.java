import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter height of person in inches: ");
        int height=sc.nextInt();
        float cm=height*2.54f;
        System.out.println("Height of person in centimeters is: "+cm+"cm");
    }
}