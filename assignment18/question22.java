/*22.Create a class FourWheeler with two data member(category and amount).Declare two members functions.
a)char getCategory() :- which returns category
b)int getamount():- which returns amount

Create another class Car with two data members (brand and model).
Declare two member function:- 
a)getDetail():- which accepts the brand, model, category and amount of a Car
b)showDetail():- which displays the category, amount, brand and model.


*/
class FourWheeler {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    protected char category;
    protected int amount;

    char getCategory() {
        System.out.print("Enter Car Category : ");
        char category = sc.next().toUpperCase().charAt(0);
        return category;
    }

    int getAmount() {  
        System.out.print("Enter Car Amount : ");
        int amount = sc.nextInt();
        return amount;
    }
}

class Car extends FourWheeler {
    private String brand;
    private String model;

    void getDetail() {
        System.out.print("Enter Car Brand : ");
        brand = sc.nextLine();
        System.out.print("Enter Car Model : ");
        model = sc.nextLine();
        this.category = getCategory();
        this.amount = getAmount();
    }
    void show() {
        System.out.println("\n\n###CAR DETAIL'S###");
        System.out.println("Category    :   "+category);
        System.out.println("Amount      :   "+amount);
        System.out.println("Brand       :   "+brand);
        System.out.println("Model       :   "+model);
    }
}

class TestMain {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.getDetail();
        obj.show();
    }
}


//  public static void main (String[] args) {
//         FourWheeler obj = new FourWheeler();
//         System.out.println("###CAR DETAIL'S###");
//         System.out.println("\nCar Category : "+obj.getCategory());
//         System.out.println("\nCar Amount   : "+obj.getAmount());
//         System.out.println();
//     }