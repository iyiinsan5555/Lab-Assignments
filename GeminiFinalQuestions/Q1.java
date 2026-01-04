public class Q1 {

    public static int recursiveDigitSum(int number) {
        if (number == 0) { return 0; }

        return recursiveDigitSum(number/10) + (number % 10);
    }

}
