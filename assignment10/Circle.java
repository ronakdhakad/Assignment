// Circle Geometry
// Create a class Circle with field radius.
// Use a setter to assign radius. Add methods to compute area and circumference.
public class Circle {
    private  int radius;

    public void assign(int radius){
        this.radius=radius;
    }
    public float area(){
        float area=(3.14f*radius*radius);
        return area;
    }
    public float circumference(){
        float circumference=(2*3.14f*radius);
        return circumference;
    }
    public void get(){
        System.out.println("Area of circle : "+area());
        System.out.println("circumference of circle : "+circumference());
    }
    
}
class Main{
    public static void main(String args[]){
        Circle obj=new Circle();
        obj.assign(10);
        obj.get();
    }
}

