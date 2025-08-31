// Rectangle Area Calculator
// Create a class Rectangle with fields: length, width.
// Use setters to assign values. Add a method to calculate area.
public class Rectangle {
    private int length;
    private int width;
 
    public void assign(int length,int width) {
       this.length = length;
       this.width = width;
    }
 
    public float area() {
       float areaRect = length*width;
       return areaRect;
    }
 
    public void get() {
       System.out.println("Area of rectangle is: "+area());
    }
 }
 class Main{
   public static void main(String args[]){
       Rectangle obj=new Rectangle();
       obj.assign(10,20);
       obj.get();
   }
}

 