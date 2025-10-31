import java.util.Scanner;

public class Scenario2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base: ");
        long base = scanner.nextLong();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        long result = power(base, exponent);

        System.out.println("Result: " + result);

        scanner.close();

    }

    static long power(long base, int exp) {

        if (exp < 0) {
            System.out.println("Exponent cannot be lower than 0.");
            exp = exp * -1;
            System.out.println("So I'm getting absolute value of exponent.");
        }

        //Base case
        if (exp == 0) {
            return 1;
        }

        return base * power(base, (exp - 1));
    }

} // test

