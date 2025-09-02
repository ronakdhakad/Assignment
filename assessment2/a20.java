import java.util.Scanner;
class Code20{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        //volume of ice-cream
        System.out.println("enter length");
        int length=sc.nextInt();

        System.out.println("enter breadth");
        int breadth = sc.nextInt();

        System.out.println("enter height");
        int height=sc.nextInt();

        int volume_of_ice_cream=length*breadth*height;

        System.out.println("volume of ice-cream : "+volume_of_ice_cream+"cm^3");
    }
}
