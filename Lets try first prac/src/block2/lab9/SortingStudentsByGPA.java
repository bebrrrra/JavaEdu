package block2.lab9;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2){
        return Double.compare(s2.getGPA(), s1.getGPA());
        //reversed because we need sorting in descending order
    }
}
