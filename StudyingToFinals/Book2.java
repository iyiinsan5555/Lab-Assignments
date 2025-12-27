public class Book2 {

    private String title;
    private int pages;

    public Book2(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }


    public void increasePages(int number) {
        this.pages += number;
    }

    public void printBook(){
        System.out.println("Title: " + this.title + " Pages: " + this.pages);
    }

}
