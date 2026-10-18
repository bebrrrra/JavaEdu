package block2.lab13.task6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner console = new Scanner(System.in);

        System.out.print("Введите имя файла: ");
        String fileName = console.nextLine();

        Scanner file = new Scanner(
                new File("Lets try first prac/src/block2/lab13/task6/" + fileName)
        );

        ArrayList<String> words = new ArrayList<>();

        while (file.hasNext()) {
            words.add(file.next());
        }

        file.close();

        String result = getLine(words);

        if (result == null) {
            System.out.println("Невозможно составить цепочку");
        } else {
            System.out.println(result);
        }
    }

    public static String getLine(ArrayList<String> words) {

        boolean[] used = new boolean[words.size()];
        StringBuilder result = new StringBuilder();

        if (buildLine(words, used, result, 0, -1)) {
            return result.toString();
        }

        return null;
    }

    private static boolean buildLine(
            ArrayList<String> words,
            boolean[] used,
            StringBuilder result,
            int count,
            int lastIndex) {

        if (count == words.size()) {
            return true;
        }

        for (int i = 0; i < words.size(); i++) {

            if (used[i]) {
                continue;
            }

            if (lastIndex != -1) {

                String previous = words.get(lastIndex);
                String current = words.get(i);

                char last = Character.toLowerCase(
                        previous.charAt(previous.length() - 1));

                char first = Character.toLowerCase(
                        current.charAt(0));

                if (last != first) {
                    continue;
                }
            }

            int oldLength = result.length();

            if (result.length() > 0) {
                result.append(" ");
            }

            result.append(words.get(i));
            used[i] = true;

            if (buildLine(words, used, result, count + 1, i)) {
                return true;
            }

            used[i] = false;
            result.setLength(oldLength);
        }

        return false;
    }
}