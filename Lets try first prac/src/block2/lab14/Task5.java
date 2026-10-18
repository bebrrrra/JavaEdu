package block2.lab14;

import java.time.LocalDate;
import java.time.DateTimeException;

public class Task5 {

    public static boolean checkDate(String date) {

        String regex =
                "(0[1-9]|[12][0-9]|3[01])/" +
                        "(0[1-9]|1[0-2])/" +
                        "(19[0-9]{2}|[2-9][0-9]{3})";

        if (!date.matches(regex)) {
            return false;
        }

        String[] parts = date.split("/");

        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        try {
            LocalDate.of(year, month, day);
            return true;
        } catch (DateTimeException e) {
            return false;
        }
    }

    public static void main(String[] args) {

        String[] dates = {
                "29/02/2000",
                "30/04/2003",
                "01/01/2003",
                "29/02/2001",
                "30-04-2003",
                "1/1/1899"
        };

        for (String date : dates) {
            System.out.println(date + " : " + checkDate(date));
        }
    }
}
