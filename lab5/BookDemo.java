import java.util.*;

class Book {
    String title, author;
    int edition;

    public Book(String title, String author, int edition) {
        this.title = title;
        this.author = author;
        this.edition = edition;
    }

    public void display() {
        System.out.println("Title: " + title + ", Edition: " + edition);
    }
}

public class BookDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask how many books the user wants to enter
        System.out.print("How many books do you want to enter? ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        // Create an array for the books
        Book[] books = new Book[n];

        // Enter book details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for book " + (i + 1));
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("Edition: ");
            int edition = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            books[i] = new Book(title, author, edition);
        }

        // Sort books by title
        Arrays.sort(books, Comparator.comparing(b -> b.title));

        // Get the author to search for
        System.out.print("Enter the author's name to search: ");
        String searchAuthor = scanner.nextLine();

        // Display books by the searched author
        boolean found = false;
        for (Book book : books) {
            if (book.author.equalsIgnoreCase(searchAuthor)) {
                book.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books found by the author " + searchAuthor);
        }
    }
}


/* Output

How many books do you want to enter? 2
Enter details for book 1
Title: Effective Java
Author: Joshua Bloch
Edition: 3
Enter details for book 2
Title: Clean Code
Author: Robert C. Martin
Edition: 1
Enter the author's name to search: Robert C. Martin
Title: Clean Code, Edition: 1

  */
