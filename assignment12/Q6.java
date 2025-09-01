//6.Find the area of a triangle, sides of which are 10 cm and 9 cm and the perimeter 36 cm.
class Main{
    public static void main(String args[]){
        int a=10;
        int b=9;
        int perimeter=36;
        int c=perimeter-(a+b);
        
        double s=(double)(a+b+c)/2;
        double area=Math.sqrt(s*((s-a)*(s-b)*(s-c)));

        System.out.println("Area of triangle is: "+area+" cm^2");
    }
}