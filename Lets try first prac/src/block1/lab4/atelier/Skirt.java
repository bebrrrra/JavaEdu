package block1.lab4.atelier;

class Skirt extends Clothes implements WomenClothing {
    public Skirt(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWomen() {
        System.out.printf("Юбка             -> Размер: %s (%d, %s), Цена: %.2f руб., Цвет: %s%n",
                size, size.getEuroSize(), size.getDescription(), cost, color);
    }
}
