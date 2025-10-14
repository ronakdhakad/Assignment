/*25.Create a class Publication with two data members (title and price).Declare two member function:-
a)getData():- for accepting data from user.
b)putData():- for displaying data.

Create another class Sales with three data member ((s1,s2,s3) which accepts the sales of three months).
Declare two member function :-
a)getSales():- for accepting three month sales. 
b)showsales():- for displaying sales.

Create one more class Book with one data member (pages).
Declare two member function :- 
a)getBookDetail():- which accepts the book details which includes title, price, sales and pages. 
b)showBookDetail():- which displays the book details which includes title, price, sales and pages.
*/
import java.util.Scanner;
class Publication {
    Scanner sc = new Scanner(System.in);
    protected String title;
    protected int price;

    void getData() {
        System.out.print("\nEnter title : ");
        title = sc.nextLine();
        System.out.print("Enter price : ");
        price = sc.nextInt();
    }

    void putData() {
        System.out.println("Title : "+title);
        System.out.println("Price : "+price);
    }
}

class Sales extends Publication {
    protected float s1;
    protected float s2;
    protected float s3;

    void getSales() {
        System.out.print("Enter First months sales : ");
        s1 = sc.nextFloat();
        System.out.print("Enter Second months sales : ");
        s2 = sc.nextFloat();
        System.out.print("Enter Third months sales : ");
        s3 = sc.nextFloat();
    }

    void showSales() {
        System.out.println("First Month Sales : "+s1);
        System.out.println("Second Month Sales : "+s2);
        System.out.println("Third Month Sales : "+s3);
    }
}

class Book extends Sales{
    private int pages;

    void getBookDetail() {
        getData();
        getSales();
        System.out.print("Enter Pages : ");
        pages = sc.nextInt();
    }

    void showBookDetail() {
        System.out.println("\n\n###BOOK DETAIL'S###");
        putData();
        showSales();
        System.out.println("Pages : "+pages);
    }
}
class TestMain {
    public static void main(String args[]) {
        Book book = new Book();

        book.getBookDetail();
        book.showBookDetail();
    }
}