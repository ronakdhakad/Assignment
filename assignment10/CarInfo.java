// Car Info Manager
// Create a class Car with fields: brand, model, and year.
// Use setters to assign values. Create a method to print full car info.
public class CarInfo {
    private String brand;
    private String model;
    private int year;
    public void give(String brand,String model,int year){
        this.brand=brand;
        this.model=model;
        this.year=year;
    }
    public void take(){
        System.out.println("Car Brand: "+brand);
        System.out.println("Car Model: "+model);
        System.out.println("Car Year: "+year);
    }
}
class Main{
    public static void main(String args[]){
        CarInfo obj=new CarInfo();
        obj.give("TATA","tataNeno",2011);
        obj.take();
    }
}
