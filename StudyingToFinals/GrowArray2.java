import java.util.Arrays;

public class GrowArray2 {

    public static void main(String[] args) {

        int count = 0;
        int[] startArray = new int[5];

        while (count < 1000) {

            if (count < startArray.length) {
                startArray[count] = count+1;
                count += 1;
            } else {
                int[] newArray = new int[count*2];
                System.arraycopy(startArray,0,newArray,0, startArray.length);
                startArray = newArray;
            }
        }

        System.out.println(Arrays.toString(startArray));
    }

}
