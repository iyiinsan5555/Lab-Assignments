public class Book {
    private String title;
    private int pages;

    public Book(String title, int pages){
        this.title = title;
        this.pages = pages;
    }

    public void addPages(int incrementAmount){
        if (incrementAmount > 0) {
            this.pages += incrementAmount;
        } else {
            System.out.println("Invalid amount!");
        }
    }

    public void printBook(){
        System.out.println("Title: " + this.title);
        System.out.println("Pages: " + this.pages);
    }
}
