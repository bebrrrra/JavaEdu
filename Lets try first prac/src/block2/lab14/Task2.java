package block2.lab14;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String text = scanner.nextLine();

        String regex = "abcdefghijklmnopqrstuv18340";

        if (text.matches(regex)) {
            System.out.println("Правильная строка");
        } else {
            System.out.println("Неправильная строка");
        }
    }
}
