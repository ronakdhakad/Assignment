// Book Library
// Create a class Book with fields: title, author, and price.
// Use setters to assign values and a method to print book details.

import java.util.Scanner;
public class Book{
    private String title;
    private String author;
    private int price;

    public void setValue(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public void getValue(){
        System.out.println("Title of book is: "+title);
        System.out.println("Author of book is: "+author);
        System.out.println("Price of book is: "+price);
    }
}
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Book b=new Book();
        System.out.println("Enter book details:- String title,String author,int price");
        b.setValue(sc.next(),sc.next(),sc.nextInt());
        b.getValue();
    }
}