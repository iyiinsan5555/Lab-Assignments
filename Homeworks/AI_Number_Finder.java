import java.util.Scanner;

public class AI_Number_Finder {
    public static void main(String[] args) {

        //AI Tries to find correct number

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter goal number and AI will try to find it: ");
        int goalNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter upper limit: ");
        int upperLimit = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter lower limit: ");
        int lowerLimit = scanner.nextInt();
        scanner.nextLine();

        int loopCount = 0;
        int AI_Guess; // Declare here, calculate inside the loop
        int result;

        while (lowerLimit <= upperLimit) { // Loop until the range is valid

            // Calculate the midpoint guess
            AI_Guess = lowerLimit + (upperLimit - lowerLimit) / 2;
            loopCount++;

            result = checkForGoal(AI_Guess, goalNumber);

            if (result == 0) {
                System.out.println("AI found the number in " + loopCount + " guesses! It's " + AI_Guess);
                break;
            } else if (result == 1) { // AI_Guess < goalNumber (Need to go higher)
                System.out.println( "Guess: " + AI_Guess + " AI is going higher to find the number");
                lowerLimit = AI_Guess + 1;
            } else if (result == -1) { // AI_Guess > goalNumber (Need to go lower)
                System.out.println("Guess: " + AI_Guess + " AI is going lower to find the number");
                upperLimit = AI_Guess - 1;
            }
        }

    }




    static int checkForGoal(int AIGuess, int goal) {

        if (AIGuess < goal) {
            return 1; // AI Goal is higher
        } else if (AIGuess == goal) {
            return 0; //we found it
        } else {
            return -1; // we need to go lower
        }

    }
}
