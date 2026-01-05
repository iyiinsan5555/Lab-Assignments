public class Testing {
    public static void main(String[] args) {
        Author a1 = new Author("Melih Berk", "Sönmez");
        int[] pageCounts = {1, 2,51,35,15,12,41};
        NewBook book1 = new NewBook(a1, pageCounts);

        System.out.println(book1.getTotalPages());
    }
}
