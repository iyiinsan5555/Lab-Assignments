public class SecondMin {

    public static int secondMin(int[] array) {
        int min1;
        int min2;
        //initializing
        if (array[0] < array[1]) {
            min1 = array[0];
            min2 = array[1];
        } else {
            min1 = array[1];
            min2 = array[0];
        }

        //Looping through array
        for (int i=2; i<array.length; i++) {
            if (array[i] < min1) {
                min2 = min1;
                min1 = array[i];
            } else if (array[i] < min2) {
                min2 = array[i];
            }
        }

        return min2;
    }


    public static void main(String[] args) {

        int[] myArray = {-1241,-1,1,2,3,4,5,6,7,8346,634,6,7457,8,568,324,23,6,56856,85,324,24,235};
        System.out.println(secondMin(myArray));

    }
}
