package PracticWork_13;

import PracticWork_13.Student;

import java.util.Comparator;

public class SortingStudent implements Comparator<Student> {
    public final static int ATTR_ID = 0x1;
    public final static int ATTR_GROUP = 0x2;
    public final static int ATTR_MARK = 0x3;
    public final static int ATTR_NAME = 0x4;
    private int currentAttr;

    SortingStudent(){
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

    public void setCurrentAttr(int currentAttr) {
        this.currentAttr = currentAttr;
    }

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
}
