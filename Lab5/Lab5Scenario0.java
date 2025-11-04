import java.util.Scanner;

public class Lab5Scenario0 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int user_num = scanner.nextInt();

        long result = factorize(user_num);

        System.out.printf("%nResult: %d", result);

        scanner.close(); //Don't forget to close resources

    }

    static long factorize(int n) {

        if (n < 0) { //Give error
            System.out.println("Cannot factorize a negative number.");
            n = Math.abs(n);
            System.out.printf("So I'm getting abs value of -%d", n);
        }

        if (n == 0) { //Base case, 0! is equal to 1
            return 1;
        }

        return n * factorize(n-1);
    }

}