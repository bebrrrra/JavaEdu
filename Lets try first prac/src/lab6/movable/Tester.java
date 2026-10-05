package lab6.movable;

public class Tester {
    public static void main(String[] args) {

        // Проверяем MovablePoint
        MovablePoint point = new MovablePoint(10, 20, 2, 3);

        System.out.println("=== MovablePoint ===");
        System.out.println("Начальное положение:");
        System.out.println(point);

        point.moveUp();
        System.out.println("После moveUp:");
        System.out.println(point);

        point.moveDown();
        System.out.println("После moveDown:");
        System.out.println(point);

        point.moveLeft();
        System.out.println("После moveLeft:");
        System.out.println(point);

        point.moveRight();
        System.out.println("После moveRight:");
        System.out.println(point);


        // Проверяем MovableCircle
        MovableCircle circle =
                new MovableCircle(10, 20, 2, 3, 5);

        System.out.println("\n=== MovableCircle ===");
        System.out.println("Начальное положение:");
        System.out.println(circle);

        circle.moveUp();
        System.out.println("После moveUp:");
        System.out.println(circle);

        circle.moveRight();
        System.out.println("После moveRight:");
        System.out.println(circle);

        circle.moveDown();
        System.out.println("После moveDown:");
        System.out.println(circle);

        circle.moveLeft();
        System.out.println("После moveLeft:");
        System.out.println(circle);
    }
}
