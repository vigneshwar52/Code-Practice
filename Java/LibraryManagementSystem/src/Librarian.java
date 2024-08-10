public class Librarian extends Person {
    private int employeeId;

    public Librarian(String name, String email, int employeeId) {
        super(name, email);
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    // Method overriding (from Person class)
    @Override
    public void showDetails() {
        System.out.println("Librarian Name: " + getName());
        System.out.println("Librarian Email: " + getEmail());
        System.out.println("Employee ID: " + employeeId);
    }

    public void addBook(Book book, Library library) {
        library.addBook(book);
        System.out.println("Book titled " + book.getTitle() + " added to the library.");
    }

    public void removeBook(Book book, Library library) {
        library.removeBook(book);
        System.out.println("Book titled " + book.getTitle() + " removed from the library.");
    }
}
