import java.util.Scanner;

public class Lab3Scenario2 {   // !!! Write another code for more than one team.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Your student id: ");
        long studentId = scanner.nextLong();

        if ((studentId % 2 == 0) && !(studentId % 3 == 0)) {
            System.out.println("Student is in ALPHA TEAM!");
        } else if ((studentId % 5 == 0) || (studentId % 7 == 0)) {
            System.out.println("Student is in BETA TEAM!");
        } else if ((studentId % 9) > 5) {
            System.out.println("Student is in THETA TEAM!");
        } else {
            System.out.println("Student is in SIGMA TEAM!");
        }

        scanner.close(); //Always make sure to close your scanner.

        //If one than more team is allowed:
        // there would be a problem for example if the id is equal to 7
        // it would satisfy both conditions for ' If the remainder of the number when divided by 9 is greater than 5' and ' If the remainder of the number when divided by 9 is greater than 5'
        // and to allow more than one team we have to use if , if conditions instead of if, else if conditions.

    }
}
