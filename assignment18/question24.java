/*24.Create a class Rectangle with two protected data members (length and breadth).Declare a Constructor which accepts length and breadth of a Rectangle
Create another class Area which calculates the area of a Rectangle.
Create another class Perimeter which calculates the perimeter of a Rectangle.*/
class Rectangle {
    protected float length;
    protected float breadth;
    
    Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}
class Area extends Rectangle {
    private float area;
    Area(float length, float breadth){
        super(length, breadth);
    }
    void calculates() {
        area = length*breadth;
    }
    void show() {
        System.out.println(" Area of Rectangle : "+area);
    }
}
class Perimeter extends Rectangle {
    private float perimeter;
    Perimeter(float length,float breadth){
        super(length,breadth);
    }
    void calculates() {
        perimeter = 2*(length+breadth);
    }
    void show() {
        System.out.println(" Perimeter of Rectangle : "+perimeter);
    }
}

class TestMain {
    public static void main(String[] args) {
        Area are = new Area(10,20);
        Perimeter peri = new Perimeter(10,20);

        are.calculates();
        are.show();

        peri.calculates();
        peri.show();
    } 
}