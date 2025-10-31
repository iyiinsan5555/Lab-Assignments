import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci number at given index: ");
        int number = scanner.nextInt();
        int result = fibonacci(number);

        System.out.println("Result: " + result);

        //Printed Fibonacci Sequence
        System.out.println("The printed version of fibonacci sequence.");
        printFibonacciSequence(number);

        scanner.close();
    }

    static int fibonacci(int n) {

        if (n == 0) { //Base cases
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }


    static void printFibonacciSequence(int n) {
        for (int i=0; i<=n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
