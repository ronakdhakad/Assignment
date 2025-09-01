// 36. What is the surface area of a cylinder if the diameter is 15m height is 7m?
class Main{
    public static void main(String args[]){
        int height=7;
        float diameter=15f;
        float radius=diameter/2f;
        float pie=3.14f;

        double surfaceArea= 2*pie*radius*height;
        double circleArea= 2*pie*radius*radius;
        double totalArea=surfaceArea+circleArea;

        System.out.println("Surface area of cylinder is: "+totalArea+" cm^2");
    }
}