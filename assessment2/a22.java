import java.util.Scanner;
class Coder22{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        //dimensions of pond
        System.out.println("enter length");
        int length=sc.nextInt();

        System.out.println("enter length");
        int width = sc.nextInt();

        System.out.println("enter length");
        int depth=sc.nextInt();

        int volume_of_pond=length*width*depth;

        System.out.println("volume of pond is : "+volume_of_pond+"m^3");
    }
}
