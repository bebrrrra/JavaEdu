package lab4.atelier;

class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.printf("Мужские штаны    -> Размер: %s (%d, %s), Цена: %.2f руб., Цвет: %s%n",
                size, size.getEuroSize(), size.getDescription(), cost, color);
    }

    @Override
    public void dressWomen() {
        System.out.printf("Женские штаны    -> Размер: %s (%d, %s), Цена: %.2f руб., Цвет: %s%n",
                size, size.getEuroSize(), size.getDescription(), cost, color);
    }
}
