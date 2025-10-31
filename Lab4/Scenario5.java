import java.util.Scanner;

public class Scenario5 {

    public static void main(String[] args ){

        Scanner scanner = new Scanner(System.in); //Creating scanner with help of OOP

        System.out.print("Enter a number: ");
        int userInt = scanner.nextInt();

        //Handling user input
        if (userInt <= 0) {
            System.out.println("Please enter a positive integer!");
            return;
        }

        fizzBuzz(userInt);

        scanner.close();
    }

    static void fizzBuzz(int n) {

        for (int i=1; i<=n; i++) { //Looping to end number

            String output = "";

            if (i % 3 == 0) {
                output += "Fizz";
            }
            if (i % 5 == 0) {
                output += "Buzz";
            }

            //Printing
            if (output.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(output);
            }

        }

    }

}
