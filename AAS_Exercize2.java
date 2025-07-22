public class AAS_Exercize2 {
    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "Java Programming", "John Doe", true),
            new Book(2, "Python Basics", "Jane Doe", false),
            new Book(3, "Data Structures", "Alice Smith", true)
        };
        Library library = new Library();
        library.listAvailableBooks(books);
    }
}
class Library {
    public void listAvailableBooks(Book[] books) {for (Book book : books) {
        if (book.isAvailable()) {
            System.out.println("Book: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }
}}
class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean isAvailable;
    public Book(int bookId, String title, String author, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }
    // Getters and Setters
    public int getBookId() { return bookId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isAvailable() { return isAvailable; }
}
