package block2.lab11;

import java.util.Calendar;
import java.text.DateFormat;

public class Task3 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2005, Calendar.MARCH, 15);

        Student student = new Student(
                "Ivan", "Ivanov", calendar.getTime()
        );

        System.out.println(student.toString(DateFormat.SHORT));
        System.out.println(student.toString(DateFormat.MEDIUM));
        System.out.println(student.toString(DateFormat.FULL));
    }
}
