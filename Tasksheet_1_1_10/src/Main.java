// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {
        // Instantiate Book objects
        Book book1 = new Book("Java Programming", "John Smith", 2021, 39.99);
        Book book2 = new Book("Python Basics", "Jane Doe", 2020, 29.99);
        Book book3 = new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);

        // Print out the details of each book
        System.out.println("Book 1:");
        printBookDetails(book1);

        System.out.println("\nBook 2:");
        printBookDetails(book2);

        System.out.println("\nBook 3:");
        printBookDetails(book3);
    }

    // Helper method to print book details
    private static void printBookDetails(Book book) {
        System.out.println("Title: \"" + book.getTitle() + "\"");
        System.out.println("Author: \"" + book.getAuthor() + "\"");
        System.out.println("Year Published: " + book.getYearPublished());
        System.out.println("Price: $" + book.getPrice());
    }
}