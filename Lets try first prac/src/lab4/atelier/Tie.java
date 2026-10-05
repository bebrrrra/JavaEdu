package lab4.atelier;

class Tie extends Clothes implements MenClothing {
    public Tie(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.printf("Галстук          -> Размер: %s (%d, %s), Цена: %.2f руб., Цвет: %s%n",
                size, size.getEuroSize(), size.getDescription(), cost, color);
    }
}