class Square{
    void area(){
        System.out.println("Area of Square");
    }
}
class Rectangle extends Square{
    @Override
    void area(){
        System.out.println("Area of Rectangle");
    }
}
class Main{
    public static void main(String args[]){
        Square obj=new Rectangle();
        obj.area();
    }
}