public class AAQ_class {
    public static void main(String[] args) {
        Book b1 = new Book();
        System.out.println("------Call Constructor Without value--------");
        System.out.println("Book Id: "+b1.bookId);
        System.out.println("Title: "+b1.title);
        System.out.println("Author: "+b1.author);
        System.out.println("Is Available: "+b1.isAvailable);

        Book b2 = new Book(1001,"Book 1", "Author 1", true);
        System.out.println("------Call Constructor With value--------");
        System.out.println("Book Id: "+b2.bookId);
        System.out.println("Title: "+b2.title);
        System.out.println("Author: "+b2.author);
        System.out.println("Is Available: "+b2.isAvailable);

        Book b3 = new Book();
        System.out.println("------Call get set With value--------");
        b3.setBookId(1002);
        b3.setTitle("Book 2");
        b3.setAuthor("Author 2");
        b3.setIsAvailable(false);
        System.out.println("Book Id: "+b3.getBookId());
        System.out.println("Title: "+b3.getTitle());
        System.out.println("Author: "+b3.getAuthor());
        System.out.println("Is Available: "+b3.getIsAvailable());
        
    }
}
class Book {
    int bookId;
    String title;
    String author;
    boolean isAvailable;
    Book()
    {
        this.bookId=0;
        this.title=null;
        this.author=null;
        this.isAvailable=true;
    }
    Book(int bookId, String title, String author, boolean isAvailable)
    {
        this.bookId=bookId;
        this.title=title;
        this.author=author;
        this.isAvailable=isAvailable;
    }
    void setBookId(int bookId){  
        this.bookId=bookId;   
    }  
    int getBookId(){  
        return this.bookId;   
    }  
    void setTitle(String title){  
        this.title=title;   
    }  
    String getTitle(){  
        return this.title;   
    }  
    void setAuthor(String author){  
        this.author=author;   
    }  
    String getAuthor(){  
        return this.author;   
    } 
    void setIsAvailable(boolean isAvailable){  
        this.isAvailable=isAvailable;   
    }  
    boolean getIsAvailable(){  
        return this.isAvailable;   
    } 
}