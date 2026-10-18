package block2.lab13.task2;

public class Person {

    private String firstName;
    private String lastName;
    private String middleName;

    public Person(String firstName, String lastName,
                  String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public String getFullName() {

        StringBuilder result = new StringBuilder(lastName);

        if (firstName != null && !firstName.isEmpty()) {
            result.append(" ")
                    .append(firstName.charAt(0))
                    .append(".");
        }

        if (middleName != null && !middleName.isEmpty()) {
            result.append(middleName.charAt(0))
                    .append(".");
        }

        return result.toString();
    }
}
