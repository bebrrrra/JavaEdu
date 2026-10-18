package block2.lab14;

import java.util.Scanner;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String text = scanner.nextLine();

        String[] words = text.split("[,;.!?\\s]+");

        System.out.println(Arrays.toString(words));
    }
}
