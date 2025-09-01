//The area of a rectangle is 96 cm².
//If the breadth of the rectangle is 8 cm, find its length and perimeter.
class Main{
    public static void main(String args[]){
        float breadth=8;
        float area=96;
        float length;
        float perimeter;
        length=area/breadth;
        perimeter=2*(length+breadth);
        System.out.println("Length of rectangle is: "+length+"cm");
        System.out.println("Perimeter of rectangle is: "+perimeter+"cm");
    }
}