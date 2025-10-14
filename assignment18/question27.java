/*27. Create a class Shape with one member function
a) double calcArea()
Create a class Rectangle with two data members (length and breadth) and inherits Shape and calculate the area
Create a class Circle with one data members (radius) and inherits Shape and calculate the area
*/
class Shape {
    double calcArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    private float length;
    private float breadth;
    
    Rectangle(float length, float breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double calcArea() {
        return length*breadth;
    }
}

class Circle extends Shape {
    private float radius;

    Circle(float radius)
    {
        this.radius = radius;
    }

    @Override
    double calcArea() {
        return (3.1413*radius*radius);
    }
}

class TestMain {
    public static void main(String args[]) {
        Rectangle rctngl = new Rectangle(203,332);
        Circle crcl = new Circle(24);
        System.out.println("Area of Rectangle : "+rctngl.calcArea());
        System.out.println("Area of Circle    : "+crcl.calcArea());
    }
}