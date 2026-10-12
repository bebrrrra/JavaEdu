package block1.lab4.atelier;

class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.printf("Мужская футболка -> Размер: %s (%d, %s), Цена: %.2f руб., Цвет: %s%n",
                size, size.getEuroSize(), size.getDescription(), cost, color);
    }

    @Override
    public void dressWomen() {
        System.out.printf("Женская футболка -> Размер: %s (%d, %s), Цена: %.2f руб., Цвет: %s%n",
                size, size.getEuroSize(), size.getDescription(), cost, color);
    }
}
