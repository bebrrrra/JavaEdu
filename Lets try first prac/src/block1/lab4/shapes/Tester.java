package block1.lab4.shapes;

public class Tester {
    public static void main(String[] args) {

        Shape shape1 = new Circle(5.0);
        Shape shape2 = new Rectangle(4.0, 6.0);
        Shape shape3 = new Square(4.0);

        System.out.println("=== Демонстрация работы программы ===");
        printShapeInfo(shape1);
        printShapeInfo(shape2);
        printShapeInfo(shape3);
    }

    public static void printShapeInfo(Shape shape) {

        System.out.println("Тип фигуры: " + shape.getType());
        System.out.printf("Площадь: %.2f%n", shape.getArea());
        System.out.printf("Периметр: %.2f%n", shape.getPerimeter());
        System.out.println("Метод toString(): " + shape.toString());
        System.out.println("------------------------------------");
    }
}
