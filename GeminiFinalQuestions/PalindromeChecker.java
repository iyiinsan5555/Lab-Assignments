import java.util.Scanner;

public class PalindromeChecker {

    public static boolean isPalindrome(String word) {
        int lookTimes = word.length() / 2;

        for (int i=0; i<lookTimes; i++) {
            char firstChar = word.charAt(i);
            char lastChar = word.charAt(word.length()-(i+1));

            if (firstChar != lastChar) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        if (isPalindrome(word)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }

}
