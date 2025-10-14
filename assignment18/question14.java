/*14.Create a class Product with data members (pid, pname, amount) and declare and define the member function 
1.acceptProduct()-- which accept product details.
2.displayProduct() -- display product information.
*/
import java.util.Scanner;
class Product{
    int pid;
    String pname;
    double amount;

    void acceptProduct(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product ID: ");
        pid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter product name: ");
        pname = sc.nextLine();
        System.out.print("Enter product amount: ");
        amount = sc.nextDouble();
    }

    void displayProduct(){
        System.out.println("\n##PRODUCT DETAIL'S##");
        System.out.println("Product ID: " + pid);
        System.out.println("Product Name: " + pname);
        System.out.println("Product Amount: " + amount);
    }

    public static void main(String[] args){
        Product  obj = new Product();
        obj.acceptProduct();
        obj.displayProduct();
    }
}
