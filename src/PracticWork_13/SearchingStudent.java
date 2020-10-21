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
            try {
                switch (currentAttr) {
                    case ATTR_ID:
                        if (i.getID() == (int)req)
                            return i;
                        break;

                    case ATTR_MARK:
                        if (i.getFinalMark() == (float) req)
                            return i;
                        break;

                    case ATTR_NAME:
                        if (i.getName().equals((String) req))
                            return i;
                        break;

                    case ATTR_GROUP:
                        if (i.getGroupName().equals((String) req))
                            return i;
                        break;
                    default:
                }
            }
            catch (Exception e){
                System.out.println("Проблема конвертирования типа запроса");
                System.out.println(e);
            }
        }
        return null;
    }

    // Линеный рекурсивный поиск
    public Student linearSearchRec(List<Student> students, Object req, int startInd){
        try {
            Student i = students.get(startInd);

            switch (currentAttr) {
                case ATTR_ID:
                    if (i.getID() == (int)req)
                        return i;
                    break; case ATTR_MARK: if (i.getFinalMark() == (float) req)
                        return i;
                    break; case ATTR_NAME: if (i.getName().equals((String) req))
                        return i;
                    break; case ATTR_GROUP:
                        if (i.getGroupName().equals((String) req))
                            return i;
                    break; default:
            }
        }
        catch (Exception e){
            System.out.println("Проблема конвертирования типа запроса");
            System.out.println(e);
        }

        if (startInd == students.size())
            return null;
        else
            return linearSearchRec(students, req, startInd +1);
    }

    public void setCurrentAttr(int currentAttr) {
        this.currentAttr = currentAttr;
    }
}
