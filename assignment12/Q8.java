//8.Find the base of a triangle whose altitude is 20 cm and area is 0.8 m².
class Main{
    public static void main(String args[]){
        float area=0.8f;
        float areaInCentimeter=area*10000;
        float base;
        float altitude=20f;
        base=(areaInCentimeter*2f)/altitude;
        System.out.println("Base of triangle is: "+base+" cm");
    }
}