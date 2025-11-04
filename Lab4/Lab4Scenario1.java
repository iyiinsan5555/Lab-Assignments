import java.util.Scanner;

public class Lab4Scenario1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        //Handling negative or zero
        if (number <= 1) {
            System.out.println("Number has the be at least 2 for a triangle.");
            return;
        }

        for (int i=1; i<=number; i++) {
            for (int j=0; j<i; j++) {

                System.out.print("*");

            }
            System.out.println();
        }

        //Close scanner
        scanner.close();

    }
}
