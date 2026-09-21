package lab2.task3;

public class Circle {
    private Point centre;
    private double radius;

    public Circle(Point centre, double radius){
        centre = new Point(0.0, 0.0);
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

    public String getCentre(){return centre.getXY();}
    public double getRadius(){return radius;}

    @Override
    public String toString(){
        return "Circle[centre(" + centre +
                ", radius = " + radius + "]";
    }
}
