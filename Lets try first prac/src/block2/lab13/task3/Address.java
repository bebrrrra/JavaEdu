package block2.lab13.task3;

import java.util.StringTokenizer;

public class Address {

    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    // Первый способ: split()
    public void parseSplit(String address) {

        String[] parts = address.split(",");

        if (parts.length != 7) {
            throw new IllegalArgumentException("Неверный адрес");
        }

        country = parts[0].trim();
        region = parts[1].trim();
        city = parts[2].trim();
        street = parts[3].trim();
        house = parts[4].trim();
        building = parts[5].trim();
        apartment = parts[6].trim();
    }

    // Второй способ: StringTokenizer
    public void parseTokenizer(String address) {

        StringTokenizer tokenizer =
                new StringTokenizer(address, ",.;");

        if (tokenizer.countTokens() != 7) {
            throw new IllegalArgumentException("Неверный адрес");
        }

        country = tokenizer.nextToken().trim();
        region = tokenizer.nextToken().trim();
        city = tokenizer.nextToken().trim();
        street = tokenizer.nextToken().trim();
        house = tokenizer.nextToken().trim();
        building = tokenizer.nextToken().trim();
        apartment = tokenizer.nextToken().trim();
    }

    @Override
    public String toString() {
        return "Страна: " + country +
                "\nРегион: " + region +
                "\nГород: " + city +
                "\nУлица: " + street +
                "\nДом: " + house +
                "\nКорпус: " + building +
                "\nКвартира: " + apartment;
    }
}