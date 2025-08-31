import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter height of person in meter: ");
        int meter=sc.nextInt();
        float feet=meter/0.3048f;
        System.out.println("Height of person in feet is: "+feet);
    }
}