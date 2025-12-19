import java.io.FileWriter;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {

        String[] output = {"file path: ", "word to be replaced: ", "replacement word: ", "output file path: "};

        Scanner scanner = new Scanner(System.in);

        String[] answers = new String[4];
        //0 --> filePath, 1--> wordToReplaced, 2--> replacement 3--> outputFilePath

        for (int i=0; i<output.length; i++) {

            System.out.print(output[i]);
            answers[i] = scanner.nextLine();
            System.out.println(); //for new line

        }

        //Opening Input File

        Scanner fileReader = null;
        HashMap<String, String> map = new HashMap<>();

        try {

            fileReader = new Scanner(Paths.get(answers[0]));

            //Getting words count
            int count = 0;
            while (fileReader.hasNextLine()) {

                String[] parts = fileReader.nextLine().trim().replace("!", "").replace(",", "").replace(".", "").trim().split(" ");

                for (String word : parts) {
                    count += 1;
                }
            }

            //Creating words array
            String[] words = new String[count];

            count = 0;

            //refreshing
            fileReader.close();
            fileReader = new Scanner(Paths.get(answers[0]));

            while (fileReader.hasNextLine()) {

                String[] parts = fileReader.nextLine().replace("!", "").replace(",", "").replace(".", "").trim().split(" ");

                for (String word : parts) {
                    words[count] = word;
                    count += 1;
                }
            }

            //Replacing part
            for (int i=0; i < words.length; i++) {
                if (words[i].equals(answers[1])) {
                    words[i] = answers[2];
                }
            }

            //Writing the file
            for (String word : words) {

                FileWriter fileWriter = new FileWriter(answers[3], true);
                Formatter formatter2 = new Formatter(fileWriter);

                formatter2.format("%s %n", word);
                formatter2.close();
                fileWriter.close();
            }


        } catch (Exception e) {
            System.out.println(e);

            System.out.print("Something went wrong.");
        } finally {
            fileReader.close();
        }

        //Replacing words



    }
}
