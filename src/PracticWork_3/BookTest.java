package PracticWork_3;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class BookTest {
    public static void main(String[] args) throws ParseException {
        Book book = new Book("Igor", 426, "1920-12-08");

        book.setDate("2020-12-12");
        System.out.println(book);

    }
}
