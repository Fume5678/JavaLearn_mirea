package PracticWork_13;

import PracticWork_13.Student;

import java.util.Comparator;

public class SortingStudentByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Float.compare(o1.getFinalMark(), o2.getFinalMark());
    }
}
