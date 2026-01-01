public class CountA {
    public static void main(String[] args) {

        int total = 0;

        for (String arg : args) {
            for (int i=0; i<arg.length(); i++) {
                if (arg.charAt(i) == 'a') {
                    total += 1;
                }
            }
        }

        System.out.println(total);
    }
}
