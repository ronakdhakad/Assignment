import java.util.Scanner;
abstract class Volume {
   public  double radius, height;

    public void getValue() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
        System.out.print("Enter height: ");
        height = sc.nextDouble();
    }

    public void showValue() {
        System.out.println("Radius = " + radius);
        System.out.println("Height = " + height);
    }
    abstract void calVol();
}

class Cone extends Volume {
    @Override
    void calVol() {
        double volume = (1.0 / 3) * Math.PI * radius * radius * height;
        System.out.println("Volume of Cone = " + volume);
    }
}

class Cylinder extends Volume {
    @Override
    void calVol() {
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of Cylinder = " + volume);
    }
}


class TestMain {
    public static void main(String[] args) {
        Cone cone = new Cone();
        System.out.println("=== Cone ===");
        cone.getValue();
        cone.showValue();
        cone.calVol();

        System.out.println("\n=== Cylinder ===");
        Cylinder cyl = new Cylinder();
        cyl.getValue();
        cyl.showValue();
        cyl.calVol();
    }
}

