package PracticWork_3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.String;

public class Book {
    private String author;
    private int amountPage;
    private Date date;
    private SimpleDateFormat simpleDateFormat;

    public Book(String author, int amountPage, String data) throws ParseException {
        this.author = author;
        this.amountPage = amountPage;
        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        date = simpleDateFormat.parse(data);
    }

    @Override
    public String toString() {
        return "Author: " + author + '\n' +
                "Amount page: " + amountPage + '\n' +
                "Date creation: " + simpleDateFormat.format(date);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAmountPage() {
        return amountPage;
    }

    public void setAmountPage(int amountPage) {
        this.amountPage = amountPage;
    }

    public Date getDate() {
        System.out.println(simpleDateFormat.format(date));
        return date;
    }

    public void setDate(String data) throws ParseException {
        this.date = simpleDateFormat.parse(data);
    }
}
