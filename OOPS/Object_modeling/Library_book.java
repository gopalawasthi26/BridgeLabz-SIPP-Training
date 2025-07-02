import java.util.ArrayList;
import java.util.List;

// Book class: Can exist independently
class Book {
    String title;
    String author;

    // Constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Display Book Info
    void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

// Library class: Aggregates multiple Book objects
class Library {
    String name;
    List<Book> books; // Aggregation: list of Book

    // Constructor
    Library(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    // Add a book to the library
    void addBook(Book book) {
        books.add(book);
    }

    // Display all books in the library
    void showBooks() {
        System.out.println("Library: " + name);
        for (Book book : books) {
            book.displayBook();
        }
    }
}

// Main class to demonstrate aggregation
public class Library_book {
    public static void main(String[] args) {
        // Independent Book objects
        Book b1 = new Book("The Alchemist", "Paulo Coelho");
        Book b2 = new Book("1984", "George Orwell");
        Book b3 = new Book("Clean Code", "Robert C. Martin");

        // Two libraries
        Library cityLibrary = new Library("City Library");
        Library universityLibrary = new Library("University Library");

        // Aggregation: Adding same books to different libraries
        cityLibrary.addBook(b1);
        cityLibrary.addBook(b2);

        universityLibrary.addBook(b2);
        universityLibrary.addBook(b3);

        // Display books in both libraries
        cityLibrary.showBooks();
        System.out.println();
        universityLibrary.showBooks();
    }
}
