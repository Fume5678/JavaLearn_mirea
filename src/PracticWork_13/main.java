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

        // По дефолту стоит параметр сортировки по ID
        SortingStudent sorter = new SortingStudent();
        students.sort(sorter);

        System.out.println("\nAfter sort");
        for (var i : students){
            System.out.println(i);
        }

        // Устанавливаем параметр сортировки по оценкам
        sorter.setCurrentAttr(SortingStudent.ATTR_MARK);
        students.sort(sorter);

        System.out.println("\nAfter sort mark");
        for (var i : students){
            System.out.println(i);
        }

        // Устанавливаем параметр сортировки по имени
        sorter.setCurrentAttr(SortingStudent.ATTR_NAME);
        students.sort(sorter);

        System.out.println("\nAfter sort name");
        for (var i : students){
            System.out.println(i);
        }
    }
}
