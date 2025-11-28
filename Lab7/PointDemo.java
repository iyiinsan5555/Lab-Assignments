public class PointDemo {
    public static void main(String[] args) {

        Point pointA = new Point (0, 0);
        Point pointB = new Point (3, 4);

        System.out.println(pointA.distanceTo(pointB)); //3-4-5

        pointA.setX(12);
        pointA.setY(5);

        pointB.setX(0);
        pointB.setY(0);

        System.out.println(pointA.distanceTo(pointB));

    }
}