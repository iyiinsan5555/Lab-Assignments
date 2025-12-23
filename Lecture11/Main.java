import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int count = 0;

        WordCount[] array = new WordCount[1];

        //Reading file
        Scanner scanner = null;

        try {

            scanner =  new Scanner(Paths.get("q1.txt"));

            while (scanner.hasNextLine()) {
                String[] words = scanner.nextLine().replace(",", "").replace(".", "").split(" ");

                for (String word : words) {
                    //Check already exists
                    boolean found = false;
                        for (WordCount item : array) {
                            if (item != null && item.getWord().equals(word)) {
                                item.incrementCount();
                                found = true;
                            }
                        }


                    if (!found) {
                        //Check for array size
                        if (array.length <= count) {
                            //Creating new array
                            WordCount[] newArray = new WordCount[count*2];
                            System.arraycopy(array, 0, newArray,0, array.length);
                            array = newArray;
                        }

                        array[count] = new WordCount(word);

                        count += 1;
                    }


                }

            }

        } catch (Exception e) {
            System.out.print(e);
        } finally {
            if (scanner != null) {
                scanner.close();
            }

            for (WordCount item : array) {
                if (item != null) {

                    System.out.println(item.getWord() + ": " + item.getCount());
                }
            }
        }

    }
}
