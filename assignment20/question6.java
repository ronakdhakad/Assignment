/*
6.Write a program to store your shopping details in a binary file
(shopping.dat) with information itemName, price, quantity.
 (Use ObjectOutputStream to store Item class object )
 */
import java.io.*;
import java.util.Scanner;

class Item implements Serializable {
    String itemName;
    double price;
    int quantity;

    public Item(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

   
    public String toString() {
        return "Item Name: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }
}

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        File file = new File("deepak@deepaks-MacBook-Air Assignment% new4.txt");

        try (FileOutputStream fos=new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            String choice;
            do {
                System.out.print("Enter Item Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Price: ");
                double price = sc.nextDouble();

                System.out.print("Enter Quantity: ");
                int quantity = sc.nextInt();
                sc.nextLine(); 

                
                Item item = new Item(name, price, quantity);
                oos.writeObject(item);

                System.out.print("Do you want to add another item? (yes/no): ");
                choice = sc.nextLine().toLowerCase();

            } while (choice.equals("yes"));

            System.out.println("\nShopping details stored successfully in shopping.dat");

        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
    }
}
