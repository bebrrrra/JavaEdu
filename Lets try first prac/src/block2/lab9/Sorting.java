package block2.lab9;

import java.util.Comparator;

public class Sorting {
    public static void insertionSort(Comparable[] list) {

        Comparable temp;
        int j;

        for (int ind = 1; ind < list.length; ind++) {
            temp = list[ind];
            j = ind - 1;

            while (j >= 0 && list[j].compareTo(temp) > 0) {
                list[j + 1] = list[j];
                j--;
            }

            list[j + 1] = temp;
        }
    }


    public static void quickSort(Student[] list, int left, int right,
                                 Comparator<Student> comparator) {
        int i = left;
        int j = right;

        Student pivot = list[(left + right) / 2];

        while (i <= j) {
            while (comparator.compare(list[i], pivot) < 0) {
                i++;
            }

            while (comparator.compare(list[j], pivot) > 0) {
                j--;
            }

            if (i <= j) {
                Student temp = list[i];
                list[i] = list[j];
                list[j] = temp;

                i++;
                j--;
            }
        }

        if (left < j) {
            quickSort(list, left, j, comparator);
        }

        if (i < right) {
            quickSort(list, i, right, comparator);
        }
    }
}
