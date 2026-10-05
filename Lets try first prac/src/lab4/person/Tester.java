package lab4.person;

public class Tester {
    public static void main(String[] args) {
        Person person1 = new Person();

        Person person2 = new Person("Иван Иванов", 25);

        System.out.println("=== Проверка первого объекта ===");
        person1.move();
        person1.talk();

        System.out.println("\n=== Проверка второго объекта ===");
        person2.move();
        person2.talk();
    }
}

