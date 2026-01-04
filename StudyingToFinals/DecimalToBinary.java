public class DecimalToBinary {

    public static void main(String[] args ){

        int number = 10;

        System.out.println(decimalToBinary(number));

    }


    public static String decimalToBinary(int n) {

        //Base Case
        if (n == 0) {
            return "";
        }

        return decimalToBinary(n/2) + (n%2);
    }
}
