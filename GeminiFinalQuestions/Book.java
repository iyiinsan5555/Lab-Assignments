public class Book {
    private String isbn;
    private String title;
    private boolean isAvailable;

    public Book(String isbn, String title, boolean isAvailable) {
        this.isbn = isbn;
        this.title = title;
        this.isAvailable = isAvailable;
    }

    //Getters
    public String getIsbn() {return this.isbn;}
    public String getTitle() {return this.title;}
    public boolean getIsAvailable() {return this.isAvailable;}

    //Setters
    public void setIsbn(String isbn) {this.isbn = isbn; }
    public void setTitle(String title) {this.title = title; }
    public void setAvailable(boolean isAvailable) {this.isAvailable = isAvailable; }

    public void borrowBook() {
        if (this.isAvailable) {
            this.isAvailable = false;
        } else {
            System.out.println("Book is not available to borrow!");
        }
    }

    public void returnBook() {
        this.isAvailable = true;
    }

    public static void main(String[] args) {
        Book b1 = new Book("11051255", "Spirit", true);
        b1.borrowBook();
        b1.borrowBook();
        b1.returnBook();
        b1.borrowBook();
    }
}
