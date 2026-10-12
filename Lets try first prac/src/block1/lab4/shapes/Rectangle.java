package block1.lab4.shapes;

class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String getType() {
        return "Прямоугольник";
    }

    @Override
    public String toString() {
        return "Прямоугольник со сторонами " + width + " и " + length;
    }
}
