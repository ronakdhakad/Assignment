// Mobile Phone Store
// Create a class Mobile with fields: brand, model, price.
// Use setters to set values. Create a method to check if phone is affordable (price < 20000).
public class Mobile {
    private String brand;
    private String model;
    private int price;
    
    public void give(String brand,String model,int price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
    public void take(){
        System.out.println("Mobile Brand: "+brand);
        System.out.println("Mobile Model: "+model);
        System.out.println("Mobile price: "+price);
        if(affordable())
            System.out.println("phone is affordable ");
        else
            System.out.println("phone is not affordable");
    }
    public boolean affordable(){
        boolean isaffordable=(price<20000);
        return isaffordable;
    }
}
class Main{
    public static void main(String args[]){
        Mobile obj=new Mobile();
        obj.give("MOTOROLA","MOTO",15000);
        obj.take();
    }
}

