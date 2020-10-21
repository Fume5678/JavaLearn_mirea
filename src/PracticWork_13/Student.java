package PracticWork_13;

import java.util.Random;

public class Student {
    private int ID;
    private String name;
    private String groupName;
    private float finalMark;

    public Student(String name, String groupName) {
        this.name = name;
        this.groupName = groupName;
        this.ID = new Random().nextInt(1000);
        finalMark = new Random().nextInt(4)+1;
        finalMark += (int)(new Random().nextFloat() * 100) / 100.0f;
    }


    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getGroupName() {
        return groupName;
    }

    public float getFinalMark() {
        return finalMark;
    }

    @Override
    public String toString() {
        return String.format("id=%d; name=%s; group=%s; final mark=%1.2f", ID, name, groupName, finalMark);
    }
}
