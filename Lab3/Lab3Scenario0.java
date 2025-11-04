import java.util.Random;

public class Lab3Scenario0 {
    public static void main(String[] args) {

        Random random_generator = new Random();

        int random_int_1 = random_generator.nextInt(100);
        int random_int_2 = random_generator.nextInt(100);

        System.out.println(random_int_1);
        System.out.println(random_int_2);

    }
}
