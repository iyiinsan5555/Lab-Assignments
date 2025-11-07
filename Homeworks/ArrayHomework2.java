import java.util.Scanner;

public class ArrayHomework2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i=0; i<size;i++) {
            System.out.print("Enter the number " + (i+1) + ": ");
            array[i] = scanner.nextInt();;
        }

        System.out.println("Successfully created array." );
        System.out.println("---Array Infos---");

        System.out.println("Size of array: " + size);

        for (int i=0; i<size;i++) {
            System.out.println("Number " + (i+1) + " : " + array[i]);
        }

    }
}
