public class AAT_Exercize3 {
    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "Java Programming", "John Doe", true),
            new Book(2, "Python Basics", "Jane Doe", false),
            new Book(3, "Data Structures", "Alice Smith", true)
        };
        Library library = new Library();
        library.listAvailableBooks(books);

        try {
            User user = new User(1, "Alice", "securePass123");
            System.out.println("User ID: " + user.getUserId());
            user.getPassword(); // Triggers exception
        } catch (SecurityException e) {
            System.out.println("Error: " + e.getMessage());
        }
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
class User{
	private final int userId;
	private String password; // Private for encapsulation
	public User(int userId, String name, String password) {
	super(name);
	if (userId <= 0) throw new IllegalArgumentException("User ID must be positive");
	if (password == null || password.length() < 8) throw new IllegalArgumentException("Password too weak");
	this.userId = userId;
	this.password = password;
	}
	String getPassword() {
	 new SecurityException("Password access restricted");
	}
	int getUserId() {
		return userId; // Immutable
	}
	@Override
	public void viewReports() {
		System.out.println(name + " cannot view reports.");
	}
}