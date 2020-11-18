package PracticWork_19;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {
    public static void appendToFile(String path, String msg) {
        try {
            FileWriter file = new FileWriter(path, true);
            file.write(msg);
            file.flush();
            file.close();
        } catch (IOException e) {
            System.out.println("ERROR:: FAILED TO WRITE FILE: " + e.getMessage());
        }

    }

    public static void writeToFile(String path, String msg) {
        try {
            FileWriter file = new FileWriter(path, false);
            file.write(msg);
            file.flush();
            file.close();
        } catch (IOException e) {
            System.out.println("ERROR:: FAILED TO WRITE FILE: " + e.getMessage());
        }
    }

    public static String readFile(String path) {
        String buff = "";
        try {
            FileReader file = new FileReader(path);
            int c;
            while ((c = file.read()) != -1) {
                buff += (char)c;
            }

            file.close();
        } catch (IOException e) {
            System.out.println("ERROR:: FAILED TO READ FILE: " + e.getMessage());
        }

        return buff;
    }

    public static void printFile(String path){
        try {
            FileReader file = new FileReader(path);

            while (file.ready()) {
                System.out.print((char) file.read());

            }

            file.close();
        } catch (IOException e) {
            System.out.println("ERROR:: FAILED TO READ FILE: " + e.getMessage());
        }
    }
}
