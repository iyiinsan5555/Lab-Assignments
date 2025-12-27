import java.util.Arrays;
import java.util.Random;

public class PeaksInArray {

    public static void main(String[] args) {

        Random rdm = new Random();

        int[] numbers = new int[30];

        for (int i=0;i<numbers.length;i++) {
            numbers[i] = rdm.nextInt(1,101);
        }

        int tallestPeak = Integer.MIN_VALUE;
        int totalPeaks = 0;

        for (int i=1; i<numbers.length-1;i++) {
            if (numbers[i] > numbers[i-1] && numbers[i] > numbers[i+1]) {

                totalPeaks += 1;
                System.out.println("Peak -->" + numbers[i-1] + "--" + numbers[i] + "--" + numbers[i+1]);
                if(numbers[i] > tallestPeak) {
                    tallestPeak = numbers[i];
                }

            }
        }
        System.out.println("Tallest Peak: " + tallestPeak);
        System.out.println(Arrays.toString(numbers));

    }

}
