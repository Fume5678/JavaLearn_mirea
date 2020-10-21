package PracticWork_13;

import java.util.List;

public class SearchingStudent {
    public final static int ATTR_ID = 0x1;
    public final static int ATTR_GROUP = 0x2;
    public final static int ATTR_MARK = 0x3;
    public final static int ATTR_NAME = 0x4;
    private int currentAttr;

    public SearchingStudent(){
        currentAttr = ATTR_ID;
    }

    // Линеный итеративный поиск
    public Student linearSearchIter(List<Student> students, Object req){

        for (Student i : students) {
           if (compare(i, req) == 0)
               return i;
        }
        return null;
    }

    // Линеный рекурсивный поиск
    public Student linearSearchRec(List<Student> students, Object req, int startInd){
        if (compare(students.get(startInd), req) == 0){
            return students.get(startInd);
        }

        if (startInd == students.size())
            return null;
        else
            return linearSearchRec(students, req, startInd +1);
    }

    // Бинарный поиск итерациями
    public Student binarySearchIter(List<Student> students, Object req){
        int start = 0;
        int end = students.size() - 1;

        while (start <= end) {

            int middle = (start + end) / 2;

            if (compare(students.get(middle), req) > 0) {
                end = middle - 1;
            }

            if (compare(students.get(middle), req) < 0) {
                start = middle + 1;
            }

            if (compare(students.get(middle), req) == 0) {
                return students.get(middle);
            }
        }
        return null;
    }

    // Рекурсивный бинарный поиск
    public Student binarySearchRec(List<Student> students, int l, int r, Object req){
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (compare(students.get(mid), req) == 0)
                return students.get(mid);

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (compare(students.get(mid), req) == 1)
                return binarySearchRec(students, l, mid - 1, req);

            // Else the element can only be present
            // in right subarray
            return binarySearchRec(students, mid + 1, r, req);
        }

        // We reach here when element is not present
        // in array
        return null;
    }

    // Сравнение объекта и значения.
    // Разные объекты поэтому интерфейс не задействован
    private int compare(Student student, Object request){
        switch (currentAttr) {
                case ATTR_ID:
                    if (student.getID() == (int)request) {
                        return 0;
                    } else {
                        return (student.getID() > (int)request) ? 1 : -1;
                    }
                case ATTR_MARK:
                    if (student.getFinalMark() == (float) request){
                       return 0;
                    } else {
                        return (student.getFinalMark() > (float)request) ? 1 : -1;
                    }
                case ATTR_NAME:
                    return (student.getName().compareTo((String)request));
                case ATTR_GROUP:
                    return (student.getGroupName().compareTo((String)request));
                default:
        }
        return 0;
    }

    // Установка ключа аттрибута
    public void setCurrentAttr(int currentAttr) {
        this.currentAttr = currentAttr;
    }
}
