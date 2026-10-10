package block1.lab4.shapes;

class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public String getType() {
        return "Квадрат";
    }

    @Override
    public String toString() {
        return "Квадрат со стороной = " + width;
    }
}
