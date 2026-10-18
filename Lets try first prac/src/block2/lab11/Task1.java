package block2.lab11;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Task1 {
    public static void main(String[] args) {

        String lastName = "Ivanov";

        Date received = new Date(126, 9, 10, 12, 0);
        Date submitted = new Date();

        SimpleDateFormat format =
                new SimpleDateFormat("dd.MM.yyyy HH:mm");

        System.out.println("Developer: " + lastName);
        System.out.println("Received: " + format.format(received));
        System.out.println("Submitted: " + format.format(submitted));
    }
}
