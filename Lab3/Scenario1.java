import java.util.Random;

public class Scenario1 {
    public static void main(String[] args){

        Random random = new Random();

        int random_hour = random.nextInt(0,24);
        int random_minute = random.nextInt(0, 60);

        System.out.printf("Time: %02d:%02d \n", random_hour, random_minute);

        //Compare part
        if (random_hour < random_minute) {
            System.out.println("Minute is greater than hour");
        } else if (random_hour > random_minute) {
            System.out.println("Hour is greater than minute");
        } else {  //There is only one way and it's equality
            System.out.println("Hour is equal to minute");
        }



    }

}
