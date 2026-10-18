package block2.lab11;

import java.util.Date;
import java.text.DateFormat;
import java.util.Locale;

public class Student {

    private String firstName;
    private String lastName;
    private Date birthDate;

    public Student(String firstName, String lastName, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String toString(int style) {

        DateFormat format =
                DateFormat.getDateInstance(style, new Locale("ru", "RU"));

        return firstName + " " + lastName
                + ", Birthday: " + format.format(birthDate);
    }

    @Override
    public String toString() {
        return toString(DateFormat.SHORT);
    }
}
