package lab2.task3;

public class Point{
    private double x = 0.0;
    private double y = 0.0;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0.0, 0.0);
    }

    public double getX() {return x;}
    public double getY() {return y;}

    public void setX(double x) {this.x = x;}
    public void setY(double y) {this.y = y;}

    public String getXY(){return "x = " + x + ", y = " + y;}

    @Override
    public String toString(){
        return "Point[" + "x: " +
                x + ", y: " + y + "]";
    }
}
