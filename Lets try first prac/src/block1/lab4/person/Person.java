package block1.lab4.person;

class Person {
    String fullName;
    int age;

    public Person() {
        this.fullName = "Неизвестный"; // Задаем дефолтное имя, чтобы вывод не был null
        this.age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(this.fullName + " движется.");
    }

    public void talk() {
        System.out.println(this.fullName + " говорит.");
    }
}
