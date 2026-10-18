package block2.lab13.task3;

public class Tester3 {

    public static void main(String[] args) {

        String[] addresses = {
                "Россия, Москва, Москва, Ленина, 10, 2, 45",
                "Россия; Татарстан; Казань; Баумана; 5; 1; 20",
                "Германия. Бавария. Мюнхен. Hauptstrasse. 12. 3. 15",
                "Россия, Московская область; Химки. Мира, 8; 2, 10"
        };

        for (int i = 0; i < addresses.length; i++) {

            Address address = new Address();

            System.out.println("Адрес " + (i + 1));

            if (i == 0) {
                address.parseSplit(addresses[i]);
            } else {
                address.parseTokenizer(addresses[i]);
            }

            System.out.println(address);
            System.out.println();
        }
    }
}
