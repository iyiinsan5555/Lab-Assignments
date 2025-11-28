public class Point {
    private int x;
    private int y;

    //Default Constructor
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    //Parametric Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point anotherPoint) {
        double dx = Math.pow(x - anotherPoint.x, 2);
        double dy = Math.pow(y - anotherPoint.y, 2);
        return Math.sqrt(dx + dy);
    }

    //Setters
    public void setX(int a) {
        x = a; //We can set up a specific boundaries
    }

    public void setY(int a) {
        y = a;
    }

    //Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point getMiddle(Point a, Point b) {
        int x = (a.getX() + b.getX()) / 2;
        int y = (a.getY() + b.getY()) / 2;

        return new Point(x, y);
    }

}