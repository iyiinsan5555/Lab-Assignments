public class CustomSummation {

    public static void main(String[] args) {
        int n = 4; // Example: first 4 terms
        double result = calculateSum(n);
        double result2 = summation(n);
        System.out.println("The sum of the first " + n + " terms is: " + result + " --> "  + result2);
    }

    /**
     * Calculates the sum of the series: 1/2 - 2/3 + 3/4 - 4/5 + ...
     * @param N The number of terms to sum
     * @return The resulting sum as a double
     */
    public static double calculateSum(int N) {
        double totalSum = 0.0;

        for (int n = 1; n <= N; n++) {
            // Calculate the term n / (n + 1)
            // Note: We cast 'n' to double to prevent integer division
            double term = (double) n / (n + 1);

            if (n % 2 == 0) {
                // If n is even, subtract the term
                totalSum -= term;
            } else {
                // If n is odd, add the term
                totalSum += term;
            }
        }

        return totalSum;
    }


    public static double summation(int n) {
        double total = 0.0;

        for (int i=n; i>=1; i--) {
            if (i%2==0) {total -= (double) i/(i+1);}
            else {total += (double) i/(i+1);}
        }
        return total;
    }

}
