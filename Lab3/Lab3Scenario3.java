import java.util.Scanner;
import java.util.Random;

public class Lab3Scenario3 {
    public static void main(String[] args) {

        Random random_generator = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("You need to type 1 for sum, 2 for difference, 3 for product and 4 for division! \n");
        System.out.print("Enter a number (between 1,4): ");
        int user_number = scanner.nextInt();

        int random_int1 = random_generator.nextInt(0, 1000);
        int random_int2 = random_generator.nextInt(0, 1000);

        System.out.println("Random number 1: " + random_int1);
        System.out.println("Random number 2: " + random_int2);


        switch (user_number) {
            case 1:
                System.out.println("Sum: " + random_int1 + random_int2);
                break;
            case 2:
                System.out.println("Difference (absolute): " + Math.abs(random_int1 - random_int2));
                break;
            case 3:
                System.out.println("Product: " + random_int1 * random_int2);
                break;
            case 4:

                //Checking for zero division
                if (random_int2 == 0) {
                    System.out.println("DIVISION BY ZERO NOT ALLOWED");
                    return;
                }

                //Float division
                float float_result = (float) random_int1 / random_int2;
                //Integer division
                int division_result = random_int1 / random_int2;
                System.out.printf("Integer division: %d  Float division: %f", division_result, float_result);

                break;
            default:
                System.out.println("Invalid number for operation!");
                // We don't need to use break
        }


        //Always make sure to close scanner.
        scanner.close();

    }
}
