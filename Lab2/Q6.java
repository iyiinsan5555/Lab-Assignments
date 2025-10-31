import java.util.Scanner;

public class Q6 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Temperature in celsius: ");
        int temperature_in_celsius = scanner.nextInt();

        float fahrenheit = (float) (temperature_in_celsius * 9/5) + 32;

        System.out.println("\nConverted "+temperature_in_celsius + " celsius to "+ fahrenheit +" fahrenheit." );

        scanner.close();
    }
} // 6627b714a1a942208c70b6fa34f174d7
