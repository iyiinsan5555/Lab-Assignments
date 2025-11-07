import java.util.Random;

public class Scenario4 {
    public static void main(String[] args) {

        Random random = new Random();

        int sizeOfArray = 30;
        int[] array = new int[sizeOfArray];

        for (int i=0;i<sizeOfArray; i++) {
            array[i] = random.nextInt(1, 101);
        }

        int peakCount = 0;
        int tallestPeak = 0;

        for (int i=0; i<sizeOfArray; i++) {

            if(i == 0 || i==sizeOfArray-1){
                continue;
            }

            if (array[i] > array[i-1] && array[i] > array[i+1]) {
                peakCount +=1;
                System.out.println("Peak: " + array[i]);

                if (array[i] > tallestPeak) {
                    tallestPeak = array[i];
                }

            }
        }

        System.out.println("Peak count: " + peakCount);
        System.out.println("Tallest peak: "+ tallestPeak);

    }
}
