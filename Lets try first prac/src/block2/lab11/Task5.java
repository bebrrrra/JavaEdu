package block2.lab11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task5 {

    public static void main(String[] args) {

        int n = 100000;

        test(new ArrayList<>(), n, "ArrayList");
        test(new LinkedList<>(), n, "LinkedList");
    }

    public static void test(List<Integer> list, int n, String name) {

        long start;
        long end;

        // Добавление в конец
        start = System.nanoTime();

        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        end = System.nanoTime();
        System.out.println(name + " Add: " + (end - start) + " ns");

        // Вставка в начало
        start = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            list.add(0, i);
        }

        end = System.nanoTime();
        System.out.println(name + " Insert: " + (end - start) + " ns");

        // Поиск по значению
        start = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            list.contains(n - 1);
        }

        end = System.nanoTime();
        System.out.println(name + " Search: " + (end - start) + " ns");

        // Удаление первого элемента
        start = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            list.remove(0);
        }

        end = System.nanoTime();
        System.out.println(name + " Remove: " + (end - start) + " ns");
    }
}
