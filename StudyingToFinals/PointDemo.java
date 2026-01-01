import java.util.Random;
import java.util.Scanner;

public class PointDemo {

    public static void main(String[] args) {
        Random rnd = new Random();

        Point[] points = new Point[50];

        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(rnd.nextInt(0, 101), rnd.nextInt(0, 101), rnd.nextInt(0, 101));
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter y: ");
        int y = sc.nextInt();
        System.out.print("Enter z: ");
        int z = sc.nextInt();

        Point userPoint = new Point(x, y, z);

        Point mostDistant = null;
        double largestDistance = Double.MIN_VALUE;

        for (Point p : points) {
            double distance = userPoint.distanceToPoint(p);

            if (distance > largestDistance) {
                largestDistance = distance;
                mostDistant = p;
            }
        }
        System.out.println(userPoint.toString());
        System.out.println(mostDistant.toString());
        System.out.println(largestDistance);
    }
}
