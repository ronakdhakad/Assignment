import java.util.Scanner;
class Circle {
    private double radius;
    private double area;

    public void init() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        radius = sc.nextDouble();
    }

    public void calc() {
        area = Math.PI * radius * radius;
    }

    
    public void display() {
        System.out.println("Area of Circle = " + area);
    }
}

class TestMain {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.init();      
        c.calc();      
        c.display(); 
    }
}

