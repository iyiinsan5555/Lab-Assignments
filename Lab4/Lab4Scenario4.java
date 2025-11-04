import java.util.Scanner;

public class Lab4Scenario4 {

    public static void main(String[] args) {

        // I need to reverse a number
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userNumber = scanner.nextInt();

        long result = reverseNumbers(userNumber);

        System.out.println("Result: " + result);

        scanner.close();
    }

    static long reverseNumbers(int number) {

        if (number == 0) {
            return 0;
        }

        boolean isNegative = (number < 0);
        number = Math.abs(number);

        long reversed = 0; //initializing variable

        while (number != 0) { //While our number is not equal!

            int digit = number % 10;

            reversed = reversed * 10 + digit; //First setting it's (basamak)

            number /= 10; //Truncation happens and it becomes zero after some time
        }

        return isNegative ? -reversed : reversed;

    }

}
