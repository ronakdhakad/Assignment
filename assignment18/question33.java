import java.util.Scanner;
class MathOperation1 {
    
    public int multiply(int x,int y){
        return x*y;
    }
    public float multiply(float x,float y,float z){
        return x*y*z;
    }
    public int multiply(int arr[]){
        int result = 1;
        for(int num  : arr){
            result *= num;
        }
        return result;
    }
    public double multiply(double x,int y){
        return x*y;
    }
}
class TestMain
{
    public static void main(String[] args){    
    MathOperation1 m = new MathOperation1();
    System.out.println("Integer :"+(m.multiply(2,6)));
    System.out.println("Float :"+(m.multiply(2.0f,1.1f,3.4f)));
    int arr[]={1,5,4};
    System.out.println("Array : "+(m.multiply(arr)));
    System.out.println("Double :"+(m.multiply(3.0,6)));
    }
}
