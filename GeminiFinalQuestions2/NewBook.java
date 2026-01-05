public class NewBook {
    private Author author;
    private int[] pageCounts;

    public NewBook(Author author, int[] pageCounts) {
        this.author = author;
        this.pageCounts = pageCounts;
    }

    public int getTotalPages() {
        int total = 0;

        for (int pageCount : pageCounts) {
            total += pageCount;
        }
        return total;
    }

}


