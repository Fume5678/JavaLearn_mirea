package PracticWork_20;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException, InterruptedException {
        BookHandler handler = new BookHandler(3);
        handler.readPage();

        handler.printTop10();
    }
}
