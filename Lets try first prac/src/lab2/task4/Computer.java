package lab2.task4;

import java.util.Scanner;

public class Computer implements Inputable {
    private String manufacturer;
    private String model;
    private int price;

    public Computer(){
    }

    public Computer(String manufacturer, String model, int price){
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
    }

    public String getManufacturer() {return manufacturer;}
    public String getModel() {return model;}
    public int getPrice() {return price;}

    @Override
    public void input(Scanner scanner){
        System.out.println("Введите производителя: ");
        manufacturer = scanner.nextLine();

        System.out.println("Введите модель: ");
        model = scanner.nextLine();

        System.out.println("Введите цену: ");
        price = scanner.nextInt();

        scanner.nextLine();
    }

    @Override
    public String toString(){
        return "Computer[" + manufacturer + ", " +
                model + ", " + price + "]";
    }
}
