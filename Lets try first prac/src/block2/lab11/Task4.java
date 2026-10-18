package block2.lab11;

import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Year: ");
        int year = scanner.nextInt();

        System.out.print("Month: ");
        int month = scanner.nextInt();

        System.out.print("Day: ");
        int day = scanner.nextInt();

        System.out.print("Hour: ");
        int hour = scanner.nextInt();

        System.out.print("Minute: ");
        int minute = scanner.nextInt();

        Calendar calendar = Calendar.getInstance();

        calendar.setLenient(false);
        calendar.clear();

        calendar.set(year, month - 1, day, hour, minute);

        Date date = calendar.getTime();

        System.out.println("Calendar: " + calendar.getTime());
        System.out.println("Date: " + date);
    }
}
