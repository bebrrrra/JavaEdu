package block1.lab4.atelier;

abstract class Clothes {
    protected ClothingSize size;
    protected double cost;
    protected String color;

    public Clothes(ClothingSize size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }
}
