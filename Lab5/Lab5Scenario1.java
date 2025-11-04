import java.util.Scanner;

public class Lab5Scenario1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number and I will sum it's digits: ");
        int number = scanner.nextInt();

        int result = sumDigits(number);

        System.out.println("Result: "+ result);

        scanner.close();

    }

    static int sumDigits(int number) {

        number = Math.abs(number); //Ignoring negative

        if (number / 10 == 0) { //Will truncate decimals (leading zero)
            return number; //Base case
        }

        int lastDigit = number % 10;

        return lastDigit + sumDigits(number/10);
    }

}
