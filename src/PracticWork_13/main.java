package PracticWork_13;

import java.util.*;


public class main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Саша", "ИК-3"));
        students.add(new Student("Леха", "ИК-1"));
        students.add(new Student("Олег", "ОК-4"));
        students.add(new Student("Маша", "БП-5"));
        students.add(new Student("Саша", "БП-1"));
        students.add(new Student("Света", "ОК-2"));

        System.out.println("Before sort");
        for (var i : students){
            System.out.println(i);
        }

        SortingStudentByID sorter = new SortingStudentByID();
        students.sort(sorter);

        System.out.println("\nAfter sort");
        for (var i : students){
            System.out.println(i);
        }

        SortingStudentByGPA sorterGPA = new SortingStudentByGPA();
        students.sort(sorterGPA);

        System.out.println("\nAfter sort GPA");
        for (var i : students){
            System.out.println(i);
        }
    }
}
