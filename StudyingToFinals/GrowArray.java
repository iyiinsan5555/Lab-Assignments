import java.util.Arrays;

public class GrowArray {

    public static int[] growArray(int[] array) {

        int[] newArray = new int[array.length * 2];
        //System.arraycopy(array,0,newArray,0,array.length);

        for (int i=0; i<array.length; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
        return array;
    }

    public static void main(String[] args)  {

        int[] myArray = {12,3,5,1,6};

        int[] grownArr = growArray(myArray);

        System.out.println(Arrays.toString(grownArr));

    }

}
