public class WordCount {
    private String word;
    private int count;

    public WordCount(String word) {
        this.word = word;
        this.count = 1;
    }

    public void incrementCount() {
        this.count += 1;
    }

    public int getCount() {
        return count;
    }

    public String getWord() {
        return this.word;
    }

}
