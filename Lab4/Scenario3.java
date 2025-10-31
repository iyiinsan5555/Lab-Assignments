import java.util.Scanner;

public class Scenario3 {

    public static void main(String [] args) {

        //Handle some edge cases
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number for factorial: ");
        int userInt = scanner.nextInt();

        long result = factorial(userInt);

        if (result == 0) {
            System.out.println("Please use valid number. Has to be a natural number!");
            System.out.println("Or you give too big number ???");
        } else {
            System.out.println("Factorial: " + result);
        }

        scanner.close();
    }

    static long factorial(int n){

        //Handling edge case
        if (n<0) {
            return 0;
        }

        //Handling zero
        if (n== 0) {
            return 1;
        }

        long result = 1;
        //I'm assuming that n is bigger than 1
        for (int i=1; i<=n; i++) {

            result *= i;

        }

        return result;
    }

}
