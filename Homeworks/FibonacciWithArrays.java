public class FibonacciWithArrays {
    public static void main(String[] args) {

        int limit = 30;

        int[] fibonacciNumbers = new int[limit];

        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;

        for (int i=2; i<limit; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i-1] + fibonacciNumbers[i-2];
            System.out.println(fibonacciNumbers[i]);
        }

    }
}
