package PracticWork_14;

import PracticWork_13.SearchingStudent;
import PracticWork_13.SortingStudent;
import PracticWork_13.Student;

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

        // Объявляем объект сортировщика и сортируем слиянием по именам
        SortingStudent sorter = new SortingStudent();
        sorter.setCurrentAttr(SortingStudent.ATTR_NAME);
        sorter.mergeSort(students, students.size());
        System.out.println("\nAfter merge sort by name");
        for (var i : students){
            System.out.println(i);
        }

        // Сортируем быстрой сортировкой по айди
        sorter.setCurrentAttr(SortingStudent.ATTR_ID);
        sorter.quickSort(students, 0, students.size() - 1);
        System.out.println("\nAfter quick sort by id");
        for (var i : students){
            System.out.println(i);
        }

        SearchingStudent searcher = new SearchingStudent();
        searcher.setCurrentAttr(SearchingStudent.ATTR_NAME);
        System.out.println("\nПоиск Сани");
        System.out.println(searcher.linearSearchIter(students, "Саша"));

        System.out.println("\nПоиск Сани рекурсивно");
        System.out.println(searcher.linearSearchRec(students, "Саша", 0));

    }
}
