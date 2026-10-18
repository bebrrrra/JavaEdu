package block2.lab9;

import java.util.Arrays;

import static block2.lab9.Sorting.insertionSort;

public class Tester {
    public static void main(String[] args) {
        Student[] students = new Student[]{new Student("Mary", 3, 4.8),
                new Student("Alex", 1, 3.8),
                new Student("Vera", 2, 4.9)};

        //insertionSort(students);
        //System.out.println(Arrays.toString(students));

        SortingStudentsByGPA comparator = new SortingStudentsByGPA();

        Sorting.quickSort(students, 0, students.length - 1, comparator);

        System.out.println(Arrays.toString(students));
    }
}
