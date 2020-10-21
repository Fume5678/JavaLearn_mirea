package PracticWork_13;

import PracticWork_13.Student;

import java.util.*;

public class SortingStudent implements Comparator<Student> {
    public final static int ATTR_ID = 0x1;
    public final static int ATTR_GROUP = 0x2;
    public final static int ATTR_MARK = 0x3;
    public final static int ATTR_NAME = 0x4;
    private int currentAttr;

    public SortingStudent(){
        currentAttr = ATTR_ID;
    }

    @Override
    public int compare(Student o1, Student o2) {
        switch (currentAttr){
            case ATTR_ID:
                return Integer.compare(o1.getID(), o2.getID());
            case ATTR_GROUP:
                return compareString(o1.getGroupName(), o2.getGroupName());
            case ATTR_MARK:
                return Float.compare(o1.getFinalMark(), o2.getFinalMark());
            case ATTR_NAME:
                return compareString(o1.getName(), o2.getName());
            default:
                return 0;
        }
    }

    /* Сортировка слиянием
    * Принимает лист для сортировки
    * и размер листа
    */
    public void mergeSort(List<Student> students, int n){
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        List<Student> l = new ArrayList<Student>(Collections.nCopies(mid, null));
        List<Student> r = new ArrayList<>(Collections.nCopies(n - mid, null));

        for (int i = 0; i < mid; i++) {
            l.set(i, students.get(i));
        }
        for (int i = mid; i < n; i++) {
            r.set(i - mid, students.get(i));
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(students, l, r, mid, n - mid);
    }

    // Быстрая сортировка
    // Принимает на вход лист для сортировки
    // Позиции начального и последнего элемента листа
    public void quickSort(List<Student> students, int begin, int end){
        if (begin < end) {
            int partitionIndex = partition(students, begin, end);

            quickSort(students, begin, partitionIndex-1);
            quickSort(students, partitionIndex+1, end);
        }
    }

    // Установка аттрибута для сортировки
    public void setCurrentAttr(int currentAttr) {
        this.currentAttr = currentAttr;
    }

    // Вспомогательные методы
    //------------------------------
    private int compareString(String str1, String str2){

        for (int i = 0; i < str1.length() && i < str2.length(); i++){
            if (str1.charAt(i) > str2.charAt(i)){
                return 1;
            }else if (str1.charAt(i) < str2.charAt(i)){
                return -1;
            }
        }

        return Integer.compare(str1.length(), str1.length());
    }

    // Метод слияния
    private void merge(
            List<Student> students,
            List<Student> l,
            List<Student> r,
            int left,
            int right
    ){
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (compare(l.get(i), r.get(j)) < 0) {             // Сравнение объектов
                students.set(k++, l.get(i++));
            }
            else {
                students.set(k++, r.get(j++));
            }
        }
        while (i < left) {
            students.set(k++, l.get(i++));
        }
        while (j < right) {
            students.set(k++, r.get(j++));
        }
    }

    // Метод деления
    private int partition(List<Student> students, int begin, int end){
        Student pivot = students.get(end);
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (compare(students.get(j), pivot) <= 0) {
                i++;

                Student swapTemp = students.get(i);
                students.set(i, students.get(j));
                students.set(j, swapTemp);
            }
        }

        Student swapTemp = students.get(i+1);
        students.set(i+1, students.get(end));
        students.set(end, swapTemp);

        return i+1;
    }
}
