// 37. The surface of the cylinder is 149 cm².
// The cylinder height is 6 cm. What is the diameter of this cylinder?
class Main{
    public static void main(String args[]){
        int height=6;
        float surfaceArea=7.7f;
        float pie=3.14f;

        double diameter= surfaceArea/2*pie*height;

        System.out.println("Diameter of cylinder is: "+diameter+" cm^2");
    }
}