class Main{
    public static void main(String args[]){
        int perimeter=230;
        int length=70;
        float breadth;
        float area;
        breadth=(perimeter/2f)-length;
        area=length*breadth;
        System.out.println("Breadth of rectangle is: "+breadth+"cm");
        System.out.println("Area of rectangle is: "+area+"cm^2");
    }
}