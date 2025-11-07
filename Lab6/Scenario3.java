import java.util.Random;
import java.util.Arrays;

public class Scenario3 {
    public static void main(String[] args) {

        //Random object
        Random random = new Random();

        String[] possibleWeathers = {"sunny", "sunny", "sunny", "sunny", "cloudy", "cloudy", "cloudy", "rainy", "rainy", "stormy"};

        int totalDays = 1000000;
        String[] days_weathers = new String[totalDays];
        long sunny = 0;
        long cloudy = 0;
        long rainy = 0;
        long stormy = 0;

        //Simulating weather conditions
        for (int i=0; i<days_weathers.length;i++) {
            String randomWeather = possibleWeathers[random.nextInt(0,10)]; //It could get each possible weather

            switch (randomWeather) {
                case "sunny":
                    sunny +=1;
                    break;
                case "cloudy":
                    cloudy +=1;
                    break;
                case "rainy":
                    rainy +=1;
                    break;
                case "stormy":
                    stormy +=1;
                    break;
            } //Increasing weather stats

            days_weathers[i] = randomWeather;
        }


        System.out.printf("Sunny: %d  Percentage: %.02f/100 %n", sunny, ((double) sunny / (double) totalDays * 100 ));
        System.out.printf("Cloudy: %d  Percentage: %.02f/100 %n", cloudy, ((double) cloudy / (double) totalDays * 100 ));
        System.out.printf("Rainy: %d  Percentage: %.02f/100 %n", rainy, ((double) rainy / (double) totalDays * 100 ));
        System.out.printf("Stormy: %d  Percentage: %.02f/100 %n", stormy, ((double) stormy / (double) totalDays * 100 ));

    }

}
