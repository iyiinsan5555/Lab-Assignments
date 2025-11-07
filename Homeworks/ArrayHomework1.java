public class ArrayHomework1 {
    public static void main(String[] args) {

        //Write a java program that stores 5 integers in an array and
        //prints the total sum of the elements

        int[] numbers = {12,32,44,59,11};

        int sum = 0;
        for (int i=0; i<numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Total: " + sum);
    }
}
