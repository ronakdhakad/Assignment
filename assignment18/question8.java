/*8.Write a program to calculate the area of a rectangle, which accepts value from the user and displays it. Use Constructor to initialize members.*/
import java.util.Scanner;
class Rectangle{
    int length,width,area;
     Rectangle(int l, int w){
        length = l;
        width  = w;
     }
    void display(){
        System.out.println("\n###RECTANGLE###");
        System.out.println("Length : "+length);
        System.out.println("Width : "+width);
    }
    void calculate()
    {
         System.out.println("\n###AREA OF RECTANGLE###");
        System.out.println("Area : "+(length*width));
    }    
}
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length of the Rectangle : ");
        int l = sc.nextInt();
        System.out.print("Enter the Width of the Rectangle : ");
        int w = sc.nextInt();

        Rectangle obj = new Rectangle(l,w);
        obj.display();
        obj.calculate();
        
    }
}