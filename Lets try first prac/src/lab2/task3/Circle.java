package lab2.task3;

public class Circle {
    private Point centre = new Point(0.0, 0.0);
    private double radius;

    public Circle(Point centre, double radius){
        this.centre = centre;
        this.radius = radius;
    }

    public void setCentre(double x, double y){
        this.centre.setX(x);
        this.centre.setY(y);
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

}
