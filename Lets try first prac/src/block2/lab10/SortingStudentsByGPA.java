package block2.lab10;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    private Student[] iDNumber;

    public void setArray(Student[] students) {
        iDNumber = students.clone();
    }

    @Override
    public int compare(Student a, Student b) {
        return Double.compare(b.getGPA(), a.getGPA());
    }

    public void outArray() {
        for (Student student : iDNumber) {
            System.out.println(student);
        }
    }

    public void quickSort() {
        if (iDNumber == null || iDNumber.length == 0) {
            return;
        }

        quickSort(iDNumber, 0, iDNumber.length - 1, this);
    }

    private void quickSort(Student[] list, int left, int right,
                           Comparator<Student> comparator) {

        int i = left;
        int j = right;

        Student pivot = list[left + (right - left) / 2];

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

    public void mergeSort() {
        if (iDNumber == null || iDNumber.length == 0) {
            return;
        }

        mergeSort(iDNumber, 0, iDNumber.length - 1, this);
    }

    private void mergeSort(Student[] list, int left, int right,
                           Comparator<Student> comparator) {

        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort(list, left, mid, comparator);
        mergeSort(list, mid + 1, right, comparator);

        merge(list, left, mid, right, comparator);
    }

    private void merge(Student[] list, int left, int mid, int right,
                       Comparator<Student> comparator) {

        Student[] temp = new Student[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (comparator.compare(list[i], list[j]) <= 0) {
                temp[k++] = list[i++];
            } else {
                temp[k++] = list[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = list[i++];
        }

        while (j <= right) {
            temp[k++] = list[j++];
        }

        for (int t = 0; t < temp.length; t++) {
            list[left + t] = temp[t];
        }
    }

    public void sortByLastName() {

        if (iDNumber == null || iDNumber.length == 0) {
            return;
        }

        Comparator<Student> byLastName = new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                return a.getLastName().compareTo(b.getLastName());
            }
        };

        quickSort(iDNumber, 0, iDNumber.length - 1, byLastName);
    }

    public Student[] mergeLists(Student[] first, Student[] second) {

        Student[] a = first.clone();
        Student[] b = second.clone();

        if (a.length > 0) {
            mergeSort(a, 0, a.length - 1, this);
        }

        if (b.length > 0) {
            mergeSort(b, 0, b.length - 1, this);
        }

        Student[] result = new Student[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            if (compare(a[i], b[j]) <= 0) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        while (i < a.length) {
            result[k++] = a[i++];
        }

        while (j < b.length) {
            result[k++] = b[j++];
        }

        return result;
    }
}
