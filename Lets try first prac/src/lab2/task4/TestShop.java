package lab2.task4;

import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();

        System.out.print("Введите количество компьютеров: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.println("\nКомпьютер №" + (i + 1));

            Computer comp = new Computer();
            comp.input(scanner);

            shop.addComputer(comp);
        }

        System.out.println("\nСписок компьютеров в магазине:");
        shop.printComputers();

        System.out.print("\nВведите модель для поиска: ");
        String model = scanner.nextLine();

        Computer found = shop.findComputer(model);

        if (found != null) {
            System.out.println("Найден компьютер:");
            System.out.println(found);
        } else {
            System.out.println("Компьютер не найден");
        }

        System.out.print("\nВведите модель компьютера для удаления: ");
        String modelToRemove = scanner.nextLine();

        shop.removeComputer(modelToRemove);

        System.out.println("\nСписок после удаления:");
        shop.printComputers();

        scanner.close();
    }
}