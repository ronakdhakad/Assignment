import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter height of person in millimeter: ");
        int millimeter=sc.nextInt();
        float inch=millimeter*25.4f;
        System.out.println("Height of person in inches is: "+inch+"inch");
    }
}