import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name?:  ");
        String name = scanner.nextLine();

        System.out.print("What is your age?:  ");
        int age = scanner.nextInt();

        System.out.printf("Hello %s. You are %02d, years old.",name ,age);

        //Increasing age by one

        int increased_age = (age + 1);
        System.out.println("\nYour age will be "+ increased_age +" next year.");


        //Don't forget to close scanner
        scanner.close();
    }
}
