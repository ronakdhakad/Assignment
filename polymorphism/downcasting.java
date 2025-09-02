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
    void show(){
        System.out.println("Show method");
    }
}
class Main{
    public static void main(String args[]){
        Square obj=new Rectangle();
        Rectangle robj=(Rectangle)obj;
        obj.area();
        //obj.show(); can't call that method because of square method have no show method
        robj.area();
        robj.show();// ref obj of rect
    }
}