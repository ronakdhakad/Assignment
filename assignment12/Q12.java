//12. Find the area of a right angled triangle whose hypotenuse is 13 cm and
//one of its sides containing the right angle is 12 cm. Find the length of the other side.
class Main{
    public static void main(String args[]){
        int hypotenuse=13;
        int height=12;
        double base;
        double area;

        base=Math.sqrt((Math.sqrt(hypotenuse))-(Math.sqrt(height)));
        area=(base*height)/2f;
        System.out.println("Length of right angled triangle: "+base);
        System.out.println("Area of right angled triangle: "+area);

    }
}