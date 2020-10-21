package PracticWork_13;

import PracticWork_13.Student;

import java.util.Comparator;

public class SortingStudentByID implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getID(), o2.getID());
    }
}
