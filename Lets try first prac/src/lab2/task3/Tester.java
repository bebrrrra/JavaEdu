package lab2.task3;

import java.util.Arrays;

public class Tester {
    private Circle[] circles;
    private int size = 0;

    public Tester(Circle[] circles) {
        this.circles = circles;
    }

    private void addCircle(Circle c){
        this.circles[size] = c;
        this.size += 1;
    }

    public void main(String[] args) {
        Point centre1 = new Point(0.0, 0.0);
        Point centre2 = new Point(3.0, 2.0);
        Circle c1 = new Circle(centre1, 3.0);
        Circle c2 = new Circle(centre2, 6.0);

        addCircle(c1);
        addCircle(c2);

        c1.setCentre(3.0, 2.0);
        c2.setRadius(4.0);

        System.out.println(Arrays.toString(circles));
    }
}
