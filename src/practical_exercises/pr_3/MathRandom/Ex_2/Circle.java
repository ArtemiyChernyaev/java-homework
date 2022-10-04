package Ex_2;

public class Circle {

    private Point centre;
    private double radius;

    public Circle(Point centre, double radius){
        this.centre = centre;
        this.radius = radius;
    }

    public Point getCentre() {
        return centre;
    }

    public double getRadius() {
        return radius;
    }
    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String toString() {
        return "Centre x=" + this.centre.getX() +
                ", y=" + this.centre.getY() +
                " Radius=" + this.radius;
    }
}
