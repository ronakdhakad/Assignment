import java.util.Scanner;
class MathOperation{
    private double x;
    private double y;
    private double r;
  
   public void init(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X : ");
        x=sc.nextDouble();
        System.out.println("Enter Y : ");
        y=sc.nextDouble();
    }
    public void add(){
        r=x+y;
    }
    public void multiply(){
       r=x*y;
    }
    public void power(){
        r=Math.pow(x,y);
    }
    public void display(){
        System.out.println("Result : "+r);
    }
}
class TestMain
{
    public static void main(String args[]){
     MathOperation math = new MathOperation();
     math.init();
     math.add();
     math.display();
     math.multiply();
     math.display();
     math.power();
     math.display();
    }
}
