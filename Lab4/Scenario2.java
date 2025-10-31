import java.util.Scanner;

public class Scenario2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Using scanner class to create a "new" object

        System.out.print("Enter your start number: ");
        int start = scanner.nextInt();

        System.out.print("Enter your end number: ");
        int end = scanner.nextInt();

        if (start > end) {
            System.out.println("Start can't be greater then end!");
            return;
        }

        int sum = 0;

        for (int i = start; i<=end; i++) { //Start and end is inclusive

            sum += i;

        }

        System.out.printf("Sum of number [%d, %d] = %d%n", start, end, sum);


        //Closing scanner object
        scanner.close();
    }

}
