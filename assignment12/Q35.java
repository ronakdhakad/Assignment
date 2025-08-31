//  35. Find the surface area of the cylindrical solid whose radius is 7.7 cm and height is 12 cm.
class Main{
    public static void main(String args[]){
        int height=12;
        float radius=7.7f;
        float pie=3.14f;

        double surfaceArea= 2*pie*radius*height;
        double circleArea= 2*pie*radius*radius;
        double totalArea=surfaceArea+circleArea;

        System.out.println("Surface area of cylinder is: "+totalArea+" cm^2");
    }
}