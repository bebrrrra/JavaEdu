package block2.lab10;

import block2.lab10.Student;

public class Tester {

    public static void main(String[] args) {

        Student[] first = {
                new Student("Ivan", "Ivanov", "Software Engineering",
                        2, "BPI253", 4.5),

                new Student("Petr", "Petrov", "Mathematics",
                        1, "BPI251", 3.7),

                new Student("Anna", "Sidorova", "Computer Science",
                        3, "BPI243", 4.9)
        };

        Student[] second = {
                new Student("Max", "Smirnov", "Software Engineering",
                        2, "BPI253", 4.2),

                new Student("Maria", "Kuznetsova", "Mathematics",
                        1, "BPI251", 5.0),

                new Student("Alex", "Volkov", "Computer Science",
                        3, "BPI243", 3.9)
        };

        SortingStudentsByGPA sorting = new SortingStudentsByGPA();

        System.out.println("Quick Sort:");

        sorting.setArray(first);
        sorting.quickSort();
        sorting.outArray();

        System.out.println("\nMerge Sort:");

        sorting.setArray(first);
        sorting.mergeSort();
        sorting.outArray();

        System.out.println("\nSort by Last Name:");

        sorting.setArray(first);
        sorting.sortByLastName();
        sorting.outArray();

        System.out.println("\nMerged Lists:");

        Student[] result = sorting.mergeLists(first, second);

        for (Student student : result) {
            System.out.println(student);
        }
    }
}
