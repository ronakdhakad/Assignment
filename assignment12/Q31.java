// 31. What will be the area of a square with perimeter 200 m?
 class Main{
    public static void main(String args[]){
        int perimeter=200;

        double side=perimeter/4f;
        double area =side*side;
        System.out.println("Area of square is: "+area+" m^2");
    }
 }