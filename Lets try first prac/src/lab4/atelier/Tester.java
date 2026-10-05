package lab4.atelier;

public class Tester {
    public static void main(String[] args) {
        // 4) Создаем массив, содержащий все типы одежды
        Clothes[] clothes = {
                new TShirt(ClothingSize.M, 1500, "Белый"),
                new Pants(ClothingSize.L, 3500, "Черный"),
                new Skirt(ClothingSize.S, 2200, "Красный"),
                new Tie(ClothingSize.XXS, 800, "Синий")
        };

        Atelier atelier = new Atelier();

        System.out.println("=== ОДЕВАЕМ МУЖЧИНУ ===");
        atelier.dressMan(clothes);

        System.out.println("\n=== ОДЕВАЕМ ЖЕНЩИНУ ===");
        atelier.dressWomen(clothes);
    }
}
