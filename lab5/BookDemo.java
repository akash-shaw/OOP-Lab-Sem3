import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private int edition;

    // Constructor
    public Book(String title, String author, int edition) {
        this.title = title;
        this.author = author;
        this.edition = edition;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getEdition() {
        return edition;
    }

    // Method to display book details
    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Edition: " + edition);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a list of books
        List<Book> books = new ArrayList<>();
        books.add(new Book("Book A", "Author 1", 1));
        books.add(new Book("Book B", "Author 2", 2));
        books.add(new Book("Book C", "Author 1", 3));
        books.add(new Book("Book D", "Author 3", 1));
        books.add(new Book("Book E", "Author 2", 1));
        books.add(new Book("Book F", "Author 3", 2));

        // Sorting the list in ascending order based on the title
        Collections.sort(books, Comparator.comparing(Book::getTitle));

        // Displaying sorted books
        System.out.println("Sorted list of books:");
        for (Book book : books) {
            book.display();
        }

        // Getting user input for author
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the author's name to search for: ");
        String searchAuthor = scanner.nextLine();

        // Displaying books written by the specified author
        System.out.println("Books written by " + searchAuthor + ":");
        boolean found = false;
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(searchAuthor)) {
                book.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books found by " + searchAuthor);
        }

        scanner.close();
    }
}


/* Output
Sorted list of books:
Title: Book A, Author: Author 1, Edition: 1
Title: Book B, Author: Author 2, Edition: 2
Title: Book C, Author: Author 1, Edition: 3
Title: Book D, Author: Author 3, Edition: 1
Title: Book E, Author: Author 2, Edition: 1
Title: Book F, Author: Author 3, Edition: 2

Enter the author's name to search for: Author 2

Books written by Author 2:
Title: Book B, Author: Author 2, Edition: 2
Title: Book E, Author: Author 2, Edition: 1


*/
