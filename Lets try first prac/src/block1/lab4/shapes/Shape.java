package block1.lab4.shapes;

abstract class Shape {

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String getType();

    @Override
    public String toString() {
        return "Это абстрактная фигура";
    }
}
