package PracticWork_3;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void testStringMethod() throws ParseException {
        Book book = new Book("Igor", 360, "1239-12-12");

        assertEquals("Author: " + "Igor" + '\n' +
                "Amount page: " + 360 + '\n' +
                "Date creation: " + "1239-12-12", book.toString());

    }

    @Test
    public void testDateSet() throws ParseException{
        Book book = new Book("Igor", 360, "1239-12-12");
        book.setDate("2020-12-12");
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
        Date assertDate =  formater.parse("2020-12-12");

        System.out.println(book.getDate());
        assertEquals(formater.format(assertDate), formater.format(book.getDate()));
    }
}