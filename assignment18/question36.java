/*36.Create class Product (pid, price, quantity) with parameterized constructor.
Create a main function in different class (say XYZ) and perform following task:
a. Accept five product information from user and store in an array
b. Find Pid of product with highest price.
c. Create method (with array of product’s object as argument) in XYZ class to calculate and return total amount spent on all products. (amount spent on single product=price of product * quantity of product)
*/
import java.util.Scanner;
class Product {
    int pid;
    int price;
    int quantity;

    Product(int pid, int price, int quantity){
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    int totalAmount(Product product[]) {
        int total = 0;
        for(int i=0 ; i<product.length ; i++)
        { 
            total += product[i].price*product[i].quantity;
        }
        return total;
    }
}
class XYZ {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Product product[] = new Product[10];

        for(int i=0 ; i<product.length ; i++)
        {
            System.out.print("Enter Product Id : ");
            int pid = sc.nextInt();
            System.out.print("Enter Product Price : ");
            int price = sc.nextInt();
            System.out.print("Enter Product Quantity : ");
            int quantity = sc.nextInt();

            product[i] = new Product(pid, price, quantity);
        }

        System.out.println("##Product With Highest Price##");
        int temp = 0;
        for(int i=1 ; i<product.length ; i++)
        { 
            if(product[temp].price<product[i].price) {
                temp = i;
            }
        }
        System.out.println("Product Id : "+product[temp].pid);

        System.out.println("##Total Amount Spent on All Product##");
        System.out.println("Total Amount : "+product[0].totalAmount(product)); 
    }
}