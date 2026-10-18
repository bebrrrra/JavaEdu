package block2.lab9;

public class Student implements Comparable<Student> {
    private String name;
    private int id;
    private double gpa;

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getGPA(){
        return gpa;
    }

    @Override
    public String toString(){
        return "Student[name = " + name +
                ", id = " + id + ", gpa = " + gpa + "]";
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }
}
