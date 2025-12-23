import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] intArray) {

        for (int i=0; i<intArray.length-1;i++) {
            boolean swapped = false;
            for (int j=0; j<intArray.length-1;j++) {
                if (intArray[j] > intArray[j+1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                return intArray;
            }
        }

        return intArray;
    }


    public static void main(String[] args) {

        int[] myArray = {1,234,5,21,46,88,91,3};
        System.out.println(Arrays.toString(bubbleSort(myArray)));

    }

}
