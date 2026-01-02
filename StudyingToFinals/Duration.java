public class Duration {
    private int minutes;
    private int seconds;

    public Duration(int m, int s) {
        this.minutes = m;
        this.seconds = s;
        this.makeValid();
    }

    public void makeValid(){
        if (this.seconds >= 60) {
            this.minutes += (this.seconds / 60);
            this.seconds = (this.seconds % 60);
        }
    }

    //Getters
    public int getMinutes() { return this.minutes;}
    public int getSeconds() { return this.seconds;}

    public static Duration totalDurationInArray(Duration[] array) {
        int totalMin = 0;
        int totalSec = 0;

        for (Duration d : array) {
            totalMin += d.getMinutes();
            totalSec += d.getSeconds();
        }
        return new Duration(totalMin, totalSec);
    }

    public static void main(String[] args) {
        Duration[] array = {new Duration(1,50), new Duration(3,10), new Duration(12,75)};

        Duration d = totalDurationInArray(array);

        System.out.println(d.getMinutes() + " " + d.getSeconds());

    }
}
