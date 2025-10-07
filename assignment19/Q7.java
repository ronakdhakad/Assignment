/*
7. Library Catalog

Create a class Library with a nested class Book. 
Each book should have a title, author, and genre. The outer class should:

· Add books to the catalog

· Search books by genre

· Display all books

Include a static nested class LibraryUtils to:

· Sort books alphabetically

· Count books by genre
 */

class Library {
    Book[] books = new Book[10];
    int bookCount = 0;

    // add a book
    void addBook(String title, String author, String genre) {
        books[bookCount] = new Book(title, author, genre);
        bookCount++;
    }

    // search by genre
    void searchByGenre(String genre) {
        System.out.println("\nBooks in genre: " + genre);
        for (int i = 0; i < bookCount; i++) {
            if (books[i].genre.equalsIgnoreCase(genre)) {
                books[i].display();
            }
        }
    }

    // display all books
    void displayAll() {
        System.out.println("\nAll Books:");
        for (int i = 0; i < bookCount; i++) {
            books[i].display();
        }
    }

    // inner class
    class Book {
        String title, author, genre;

        Book(String title, String author, String genre) {
            this.title = title;
            this.author = author;
            this.genre = genre;
        }

        void display() {
            System.out.println("Title: " + title + ", Author: " + author + ", Genre: " + genre);
        }
    }

    // static nested class
    static class LibraryUtils {
        static int countBooksByGenre(Library.Book[] books, int count, String genre) {
            int c = 0;
            for (int i = 0; i < count; i++) {
                if (books[i].genre.equalsIgnoreCase(genre)) c++;
            }
            return c;
        }
    }
}

class Test {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook("Java", "Alice", "Programming");
        lib.addBook("C++", "Bob", "Programming");
        lib.addBook("A Monk Who Sold His ferrari", "Robin Sharma", "Motivational");

        lib.displayAll();
        lib.searchByGenre("Programming");

        int count = Library.LibraryUtils.countBooksByGenre(lib.books, lib.bookCount, "Programming");
        System.out.println("\nProgramming books count: " + count);
    }
}
