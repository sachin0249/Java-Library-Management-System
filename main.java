import java.util.*;

class Library {
    List<String> bookList = new ArrayList<>();
    Set<String> categories = new HashSet<>();
    Map<String, String> bookMap = new HashMap<>();

    // Add book
    void addBook(String isbn, String title, String category) {
        bookList.add(title);
        categories.add(category);
        bookMap.put(isbn, title);
    }

    // Display books (insertion order)
    void displayBooks() {
        System.out.println("\nBooks List:");
        for(String b : bookList) {
            System.out.println(b);
        }
    }

    // Display categories
    void displayCategories() {
        System.out.println("\nCategories:");
        for(String c : categories) {
            System.out.println(c);
        }
    }

    // Retrieve by ISBN
    void getBook(String isbn) {
        if(bookMap.containsKey(isbn)) {
            System.out.println("Book: " + bookMap.get(isbn));
        } else {
            System.out.println("Book not found!");
        }
    }

    // Remove book
    void removeBook(String isbn) {
        if(bookMap.containsKey(isbn)) {
            String title = bookMap.remove(isbn);
            bookList.remove(title);
            System.out.println("Book removed: " + title);
        } else {
            System.out.println("Book not found!");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Library lib = new Library();

        // Adding books
        lib.addBook("101", "Java", "Programming");
        lib.addBook("102", "DBMS", "Database");
        lib.addBook("103", "OS", "System");

        // Display
        lib.displayBooks();
        lib.displayCategories();

        // Retrieve
        lib.getBook("102");

        // Remove
        lib.removeBook("101");

        lib.displayBooks();
    }
}
