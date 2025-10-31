import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value in 'kuruş': ");
        int user_value = scanner.nextInt();

        float lira = (float) user_value / 100;

        int decimal = user_value % 100;

        System.out.printf("%.0f lira %d kuruş", lira, decimal);

        //Splitting lira

        float per_friend = (float) lira / 3;
        System.out.printf("\nKişi başı %.2f lira.", per_friend);

        scanner.close();



    }
}
