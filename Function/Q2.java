//no argument with return type
import java.util.Scanner;
class Square{
    Scanner sc=new Scanner(System.in);
    int s=sc.nextInt();
    int square(){
        return s*s;
    }
}
class Main{
    public static void main(String args[]){
    Square obj=new Square();
    System.out.println(obj.square());
    }
}