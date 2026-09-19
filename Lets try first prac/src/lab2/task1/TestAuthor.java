package lab2.task1;

import java.lang.*;

public class TestAuthor {
    public static void main(String[] args) {
        Author auth = new Author("Vera",
                "mvk635", 'f');

        System.out.println(auth.getName());
        System.out.println(auth.getEmail());
        System.out.println(auth.getGender());

        auth.setEmail("pepe555");

        System.out.println(auth);

    }
}
