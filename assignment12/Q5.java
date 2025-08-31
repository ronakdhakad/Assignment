/*5. If it costs 1600 rs. to fence a rectangular park of length 20 m at the rate of 25 rs. per m²,
find the breadth of the park and its perimeter. Also, find the area of the field.*/
class Main{
    public static void main(String args[]){
        int cost=1600;
        int rate=25;
        int length=20;
        double perimeter=cost/rate;
        double breadth=(perimeter/2)-length;
        double area=length *breadth;
        System.out.println("Breadth of park is: "+breadth+" m");
        System.out.println("Perimeter of park is: "+perimeter+" m");
        System.out.println("Area of field is: "+area+" m^2");
    }
}