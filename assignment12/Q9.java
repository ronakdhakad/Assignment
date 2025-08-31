//9. Find the area of an equilateral triangle, the length of whose sides is 12 cm.
class Main{
    public static void main(String args[]){
        double area;
        int length=12;
        int sides=length;
        area=(Math.sqrt(3)/4f)*Math.pow(sides,2);
        System.out.println("Area of equilateral triangle is: "+area+" cm^2");
    }
}