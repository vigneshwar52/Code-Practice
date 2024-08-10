import java.lang.reflect.Member;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create a library
        Library myLibrary = new Library("City Library");

        // Create some books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("1984", "George Orwell");

        // Create a librarian and add books to the library
        Librarian librarian = new Librarian("Alice", "alice@example.com", 101);
        librarian.addBook(book1, myLibrary);
        librarian.addBook(book2, myLibrary);

        // List available books
        myLibrary.listAvailableBooks();

        // Create a member
        member member = new member("Bob", "bob@example.com", 201);

        // Member borrows a book
        member.borrowBook(book1);
        member.borrowBook(book2, 14); // Overloaded method

        // List available books after borrowing
        myLibrary.listAvailableBooks();

        // Member returns a book
        member.returnBook(book1);

        // List available books after returning
        myLibrary.listAvailableBooks();

        // Show details of librarian and member
        librarian.showDetails();
        member.showDetails();
    }
}
