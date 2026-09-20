package lab2.task2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball(0.0, 0.0);
        Ball ball2 = new Ball();

        ball1.setX(3.0);
        ball1.setY(4.0);
        System.out.println(ball1.getX());
        System.out.println(ball1.getY());

        ball2.setXY(6.0, 4.0);
        ball2.move(2.0, 2.0);
        System.out.println(ball2.getX());
        System.out.println(ball2.getY());

        System.out.println(ball1);
        System.out.println(ball2);
    }
}
