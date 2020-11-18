package PracticWork_20;

import PracticWork_19.FileHandler;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException, InterruptedException {
        BookHandler handler = new BookHandler(3);
        handler.readPage();
        handler.printTop10();

        handler.replaceSpace("NonSpace.txt", "#");
        System.out.println("\nReplaced all space\n");
        FileHandler.printFile("NonSpace.txt");
    }
}
