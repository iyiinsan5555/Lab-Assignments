import java.util.Scanner;

public class Scenario4 {
    public static void main(String[] args) {

        //Creating scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.print("a (between 1-500): ");
        int a = scanner.nextInt();

        System.out.print("b (between 1-500): ");
        int b = scanner.nextInt();

        System.out.print("c (between 1-500): ");
        int c = scanner.nextInt();


        if (a < 1 || a > 500 || b < 1 || b > 500 || c < 1 || c > 500) { //500 is inclusive
            System.out.println("Invalid length!");
            return;
        }

        // Triangle inequality

        if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)) {

            //Printing side's infos
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);

            //If satisfy triangle inequality

            if ((a == b) && (b == c)) {
                System.out.println("EQUILATERAL");
            } else if ((a == b) || (b == c) || (a == c))  {
                System.out.println("ISOSCELES");
            } else {
                System.out.println("SCALENE");
            }

            int perimeter = a + b + c;

            System.out.println("Perimeter: " + perimeter);

        }
        else {
            System.out.println("Invalid triangle you must satisfy triangle inequality");
        }

        //For sure close scanner.
        scanner.close();

    }
}
