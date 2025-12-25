public class EvenDivisors {

    public static void main(String[] args) {

        for (int i=2; i<=1000; i++) {

            int sum = 0;

              for (int j=2; j<=i;j+=2) {

                if (i%j == 0) {
                    sum += j;
                }

            }

            if (sum == i * 2) {
                System.out.println(i + " -> " + sum);
            }

        }

    }

}
