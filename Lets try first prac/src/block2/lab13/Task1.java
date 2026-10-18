package block2.lab13;

public class Task1 {

    public static void processString(String str) {

        if (str == null || str.isEmpty()) {
            System.out.println("Строка пустая");
            return;
        }

        // 2. Последний символ
        System.out.println(str.charAt(str.length() - 1));

        // 3. Заканчивается ли на !!!
        System.out.println(str.endsWith("!!!"));

        // 4. Начинается ли с I like
        System.out.println(str.startsWith("I like"));

        // 5. Содержит ли Java
        System.out.println(str.contains("Java"));

        // 6. Позиция Java
        System.out.println(str.indexOf("Java"));

        // 7. Заменить все a на o
        System.out.println(str.replace('a', 'o'));

        // 8. Верхний регистр
        System.out.println(str.toUpperCase());

        // 9. Нижний регистр
        System.out.println(str.toLowerCase());

        // 10. Вырезать Java
        int index = str.indexOf("Java");

        if (index != -1) {
            System.out.println(str.substring(index, index + 4));
        }
    }

    public static void main(String[] args) {
        processString("I like Java!!!");
    }
}
