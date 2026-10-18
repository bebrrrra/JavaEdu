package block2.lab13.task2;

public class Tester2 {

    public static void main(String[] args) {

        Person p1 = new Person("Иван", "Иванов", "Иванович");
        Person p2 = new Person("Пётр", "Петров", null);
        Person p3 = new Person(null, "Сидорова", null);

        System.out.println(p1.getFullName());
        System.out.println(p2.getFullName());
        System.out.println(p3.getFullName());
    }
}
