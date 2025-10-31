import java.util.Scanner;

public class Q2 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Write a float: ");
        float user_float = scanner.nextFloat();

        int cast_float_to_int = (int) user_float;

        System.out.println("\nYour float: " + user_float+" | Casted to int: " + cast_float_to_int);

        System.out.print("Write a int: ");
        int user_int = scanner.nextInt();

        float cast_int_to_float = (float) user_int;

        System.out.println("Int was: "+user_int+" | Casted to float: "+cast_int_to_float);

        //So when we cast float to int we will truncate decimals so our decimals will be lost.
        //If we convert a float to int we will not lose any information ig.

        //Don't forget to close scanner
        scanner.close();
    }

}
