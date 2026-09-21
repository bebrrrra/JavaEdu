package lab2.task3;

import java.util.Arrays;

public class Tester {
    private Circle[] circles = new Circle[10];
    private int size = 0;

    public Circle[] getCircles() {
        return circles;
    }

    public void addCircle(Circle c){
        this.circles[size] = c;
        changeSize();
    }

    public void changeSize(){this.size += 1;}

    public void main(String[] args) {
        Circle c1 = new Circle(new Point(0.0, 0.0), 0.0);
        Circle c2 = new Circle(new Point(1.0, 1.0), 6.0);

        c1.setCentre(4.0, 7.0);
        c1.setRadius(5.0);

        c1.getCentre();
        c1.getRadius();

        addCircle(c1);
        addCircle(c2);

        System.out.println(Arrays.toString(getCircles()));
        System.out.println(c1);
    }
}
