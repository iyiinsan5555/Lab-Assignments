import java.util.Scanner;

public class VowelCounter {

    public static int vowelCounter(String text) {
        int length = text.length();
        int total = 0;
        char[] vowels = {'a','e','i','o','u'};

        for (int i=0; i<length; i++) {
            for (char vowel : vowels) {
                if (vowel == text.charAt(i)) {
                    total += 1;
                }
            }
        }

        return total;
    }

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        String text = scr.nextLine();

        int vowelCount = vowelCounter(text);

        System.out.println(vowelCount);

    }

}
