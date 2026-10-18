package block2.lab11;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Task2 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        Date currentDate = new Date();

        SimpleDateFormat format =
                new SimpleDateFormat("dd.MM.yyyy HH:mm");

        format.setLenient(false);

        System.out.println("Enter date (dd.MM.yyyy HH:mm):");
        String input = scanner.nextLine();

        Date userDate = format.parse(input);

        if (userDate.before(currentDate)) {
            System.out.println("Date is in the past");
        } else if (userDate.after(currentDate)) {
            System.out.println("Date is in the future");
        } else {
            System.out.println("Dates are equal");
        }
    }
}
