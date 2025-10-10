/*
7. Write a program to read data from shopping.dat file creted in 
above problem and find total money spent on all shopping items.
 . (Use ObjectInputStream to read Item class object ).
 */
import java.io.*;
class Item implements Serializable{
    String itemName;
    double price;
    int quantity;

    Item(String itemName,double price,int quantity){
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
    }

    public String toString(){
        return "Item Name : "+itemName+" || price : "+price+" || quantity : "+quantity;
    }
} 

class Main{
    public static void main(String args[]){
        File file =new File("deepak@deepaks-MacBook-Air Assignment% MyFolder");
        double tms=0;
        try(FileInputStream fis=new FileInputStream(file);
            ObjectInputStream ois=new ObjectInputStream(fis)){
            while(true){
                try{
                    Item item=(Item)ois.readObject();
                    System.out.println(item);

                    tms+=item.price*item.quantity;
                }
                catch(EOFException eof){
                    break;
                }
            }
            System.out.println("\nTotal money spent on all shopping items: " + tms);
        }catch(Exception e){
            System.out.println("Exception : "+e);
        }

        
    }
}