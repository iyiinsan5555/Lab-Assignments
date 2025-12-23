public class SecondMax {

    public static int secondMax(int[] array) {
        int max1;
        int max2;
        //initializing
        if (array[0] > array[1]) {
            max1 = array[0];
            max2 = array[1];
        } else {
            max1 = array[1];
            max2 = array[0];
        }

        //Looping through array
        for (int i=2; i<array.length; i++) {
            if (array[i] > max1) {
                max2 = max1;
                max1 = array[i];
            } else if (array[i] > max2) {
                max2 = array[i];
            }
        }

        return max2;
    }


    public static void main(String[] args) {

        int[] myArray = {1,2,3,4,5,6,7,8346,634,6,7457,8,568,324,23,6,56856,85,324,24,235};
        System.out.println(secondMax(myArray));

    }
}
