public class Concatenate {
    public static void main(String[] args) {

        String[] stringArray = {"testing1", "hello", "mleih", "car","das Wetter"};

        String all = "";

        for (String thing : stringArray) {
            all += thing + "||";
        }

        String test = String.valueOf(4);

        all = all.substring(0, all.length());

        System.out.println(Integer.valueOf(15));
    }
}
