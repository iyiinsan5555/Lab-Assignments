import java.util.Scanner;

public class Lab4Scenario6 {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start int: ");
        int start = scanner.nextInt();

        System.out.print("Enter end int: ");
        int end = scanner.nextInt();

        //Creating loop for game , main loop!

        int numberLoops = 0;
        int result = start;

        while (true) {
            //Playing main game
            result = mainGameApplication(result);

            System.out.printf("Step=%d  ->  Result=%d %n" , numberLoops, result);

            //Checking for infinite loop
            if (numberLoops >= 1000) {
                System.out.println("Infinite loop detected! Breaking out.");
                break;
            }

            //Check if we reach end
            if (result == end) {
                System.out.println("You reached the end number!");
                break;
            }

            numberLoops += 1;
        }


        scanner.close();
    }


    static boolean isPrime(int n) { //Checking if it's prime

        if (n <= 0) {
            System.out.println("Negative numbers or zero can't be prime.");
            return false;
        }

        boolean divided = false;

        for (int i=1; i<=n;i++){ //Can be divided by zero so starting from 1

            if (i == 1 || i == n) {
                continue;
            }

            divided = (n % i == 0);
            if (divided) {
                return false; //If it's dividable then it's false, not prime
            }
        }
        return true; //Returning if it's prime
    }


    static int mainGameApplication(int n) {
        if (n%2 == 0) { //Then it's even
            return n / 2;
        } else if (n%3 == 0) {
            return n + 4;
        } else if (isPrime(n)) {
            return n * 2;
        } else {
            return n + 1;
        }
    }
}
