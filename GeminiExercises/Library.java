public class Library {
    private LibraryBook[] books;
    private int bookCount;

    public Library() {
        this.books = new LibraryBook[1];
        this.bookCount = 0;
    }

    public void addBook(LibraryBook book) {
        if (bookCount >= books.length) {
            LibraryBook[] newArray = new LibraryBook[books.length * 2];
            for (int i=0;i<books.length;i++) {
                newArray[i] = books[i];
            }
            books = newArray;
        }

        books[bookCount++] = book;
    }


    public int getTotalPages() {
        int total = 0;
        for (LibraryBook book : books) {
            if (book == null) {
                break;
            }
            total += book.getPages();
        }
        return total;
    }

}
