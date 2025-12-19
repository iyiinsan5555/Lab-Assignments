import java.nio.file.Paths;
import java.util.Formatter;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Scanner;


public class TextAnalyzer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file path: ");
        String filePathString = scanner.nextLine();

        HashMap <String, Integer> map = new HashMap<>();

        Scanner fileScanner = null;

        try {
            fileScanner = new Scanner(Paths.get(filePathString));

            while (fileScanner.hasNextLine()) {
                String[] parts = fileScanner.nextLine().trim().replace(",", "").replace(".","").split(" ");

                for (String word : parts) {

                    if(!map.containsKey(word)) {
                        map.put(word, 1);
                    } else {
                        Integer oldCount = map.get(word);
                        map.put(word, oldCount + 1);
                    }

                }

            }

        } catch (Exception e) {
            System.out.print("Something went wrong!");
        } finally {
            if (fileScanner != null) {
                fileScanner.close();
            }

           System.out.println(map);
        }

        //Writing file with java.util.Formatter

        Formatter formatter = null;

        //Creating File
        try {
            formatter = new Formatter("word_stats.txt");
            formatter.format("Total: %d", map.size());
        } catch (Exception e) {
            System.out.print("Something went wrong!");
        } finally {
            formatter.close();
        }

        System.out.print("Successfully wrote the file!");

        //Appending
        try {


            for (String key : map.keySet()) {

                FileWriter fileWriter = new FileWriter("word_stats.txt", true);
                Formatter formatter2 = new Formatter(fileWriter);

                formatter2.format("%n%s: %d", key, map.get(key));
                formatter2.close();
                fileWriter.close();
            }

        } catch (Exception e) {
            System.out.print("Something went wrong!");
        }


    }

}