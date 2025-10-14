/*44. Create Interface Taxable with members salesTax=7% and incomeTax=10.5%. Create abstract method calcTax().
a. Create class Employee(empId,name,salary) and implement Taxable to calculate incomeTax on yearly salary.
b. Create class Product(pid,price,quantity) and implement Taxable to calculate salesTax on unit price of product.
c. Create class for main method(Say XYZ), accept employee information and a product information from user and print income tax and sales tax respectively.
*/
interface Taxable {
    double salesTax = 7;
    double incomeTax = 10.5;

    void calcTax();
}
//a. Create class Employee(empId,name,salary) and implement Taxable to calculate incomeTax on yearly salary.
class Employee implements Taxable {
    int empId;
    String name;
    int salary;
    double tax;

    Employee(int empId, String name, int salary){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void calcTax() {
        tax = (double)((salary*12)*incomeTax/100);   
        System.out.println("\nIncome Tax on Employee yearly Salary : "+tax);
    }
}
//b. Create class Product(pid,price,quantity) and implement Taxable to calculate salesTax on unit price of product.
class Product implements Taxable {
    int pid;
    int price;
    int quantity;
    double tax;

    Product(int pid, int price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public void calcTax() {
        tax = (double)((quantity*price)*salesTax/100);
        System.out.println("\nSales Tax of product : "+tax);
    }
}

//c. Create class for main method(Say XYZ), accept employee information and a product information from user and print income tax and sales tax respectively.
class XYZ {
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.println("\n####EMPLOYEE###");
        System.out.print("\nEnter Employee Id : ");
        int eid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Employee Salary : ");
        int salary = sc.nextInt();
        Employee emp = new Employee(eid, name, salary);
        emp.calcTax();

        System.out.println("\n####PRODUCT###");
        System.out.print("\nEnter Product Id : ");
        int pid = sc.nextInt();
        System.out.print("Enter Product Price : ");
        int price = sc.nextInt();
        System.out.print("Enter Product Quantity : ");
        int quantity = sc.nextInt();
        Product prdct = new Product(pid, price, quantity);
        prdct.calcTax();
    }
}