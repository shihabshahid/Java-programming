public class AAR_Exercize1 {
    public static void main(String[] args) {
        Book book = new Book(1, "Java Programming", "John Doe", true);
        System.out.println("Book: " + book.getTitle() + ", Available: " + book.isAvailable());
    }
}
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