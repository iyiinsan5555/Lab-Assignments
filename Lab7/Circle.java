public class Circle {
    public Point center;
    public float r;

    //Default Constructor
    public Circle() {

    }

    //Parametric Constructor
    public Circle(Point center, float radius){
        this.center = center;
        this.r = radius;
    }
}