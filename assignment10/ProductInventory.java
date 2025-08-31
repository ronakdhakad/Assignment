// Product Inventory
// Create a class Product with fields: productId, name, quantity, price.
// Use setters to assign values. Add a method to calculate total value (quantity * price).
public class ProductInventory{
    private String productId;
    private String productName;
    private int quantity;
    private int price;

    public void set(String productId,String productName,int quantity,int price){
        this.productId=productId;
        this.productName=productName;
        this.quantity=quantity;
        this.price=price;
    }
    public void get(){

        System.out.println("Product ID : "+productId);
        System.out.println("Product Name : "+productName);
        System.out.println("Quantity of product : "+quantity);
        System.out.println("Price of that product : "+price);
    }
    public int get2(){
        return quantity*price;
    }
}
class Main{
    public static void main(String args[]){
        ProductInventory inv=new ProductInventory();
        inv.set("101","Cone",5,10);
        inv.get();
        System.out.println("Total price : "+inv.get2());
}
}