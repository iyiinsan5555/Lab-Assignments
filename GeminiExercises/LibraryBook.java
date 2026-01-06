public class LibraryBook {
    private String title;
    private String author;
    private int pages;

    public LibraryBook(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    //Getters
    public String getTitle() {return this.title;}
    public String getAuthor() {return this.author;}
    public int getPages() {return this.pages;}
}
