import java.util.Random;

public class Scenario2 {
    public static void main(String[] args) {

        //Random object
        Random random = new Random();

        int[] randomArray = new int[random.nextInt(10,21)];

        //Filling array with random values
        for (int i=0;i<randomArray.length;i++) {
            randomArray[i] = random.nextInt(0,100); //First one is inclusive second one is exclusive
        }

        //Printing original array
        for (int i=0;i<randomArray.length;i++) {
            System.out.print(randomArray[i] + " ");
        }
        System.out.println(); //Printing new line

        int[] reversedArray = reverseArray(randomArray);

        //Printing reversedArray
        for (int i=0;i<randomArray.length;i++) {
            System.out.print(reversedArray[i] + " ");
        }
    }

    static int[] reverseArray(int[] array) {

        int sizeOfArray = array.length;
        int[] reversedArray = new int[sizeOfArray];

        for (int i=0;i<array.length;i++) { //Looping array.length times
            reversedArray[i] = array[sizeOfArray-(1+i)]; //Proper way to do it. I just wrote algorithm on paper and found out it.
        }

        return reversedArray;
    }



}
