import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {2,10,3};
        int[] arr2 = {1,3,5};

        int[] mergedArr = mergeArrays(arr1, arr2);
        System.out.println(Arrays.toString(mergedArr));
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        int[] newArray = new int[array1.length * 2];

        for (int i=0;i<array1.length; i++) {
            if (array1[i] < array2[i]) {
                newArray[2*i] = array1[i];
                newArray[2*i+1] = array2[i];
            } else {
                newArray[2*i] = array2[i];
                newArray[2*i+1] = array1[i];
            }
        }
        return newArray;
    }
}
