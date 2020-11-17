package PracticWork_20;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sun.jdi.Value;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/*
    <=============>
    Жаль, что не смогу показать в живую этот пример. По моему мнению вышел интересным.
    Алгоритм парсит сайт и считает количество слов
    Для хранения подсчета слов использовал словари.

    Если будут какие-то комментарии или вопросы, с радостю могу где-нибудь ответить на них.
    Например в вк https://vk.com/nekich56 :)

    И у меня вопрос. Если я хочу продолжить делать игру, как мне ее показывать?
    Она находится в другом моем репозитории.
 */

public class BookHandler {
    public String my_url = "https://librebook.me/voina_i_mir/vol11/";
    private int pages;
    private Map<String, Integer> dictionary;
    private int current_page;


    // Принимает количество страниц на странице. Может это не лучший вариант для пользователя,
    // Но пока не знаю, как ограничить поиск страниц
    BookHandler(int pages){
        current_page = 1;
        this.pages = pages;
        dictionary = new HashMap<String, Integer>();
    }

    public void readPage() throws IOException, InterruptedException {
        // Считываем страницу
        Document doc = Jsoup.connect(my_url + current_page).get();
        // Парсим элементы с классом b-chapter
        // Именно в нем находится сам рассказ
        Elements elements = doc.getElementsByClass("b-chapter");
        // Создаем правило для отсечения всех небуквенных символов. Всякие запяте, точки, тире и тд, чтобы
        // не попадали в словарь
        Pattern pattern = Pattern.compile("[[\\W[0-9_]]&&[\\S]&&[^А-Яа-я]]");

        // Получаем все элементы с тегом <p> и берем сдержащийся в них текст. Текст зачем-то разбит по этим p'шкам
        for (Element i : elements.select("p")) {
            String intext = i.text();

            // Объект матчер для поиска шаблонов в строке
            Matcher matcher = pattern.matcher(intext);

            // Убираем все найденные символы.
            // Приводим все в нижний регистр
            // Слова превращаем в набор ключей для словаря, отсекая пробелы
            intext = matcher.replaceAll("");
            intext = intext.toLowerCase();
            String[] keys_list = intext.split(" ");

            // Дальше в цикле проходимся по ключам и считаем слова на странице
            // Если ключа нет, то создаем новое поле со значение 1
            // Иначе инкрементируем
            for (String key : keys_list) {
                if (key.equals(""))
                    continue;
                if (dictionary.get(key) == null) {
                    dictionary.put(key, 1);
                } else {
                    int value = (int) dictionary.get(key);
                    value++;
                    dictionary.put(key, value);
                }
            }
        }

        if (current_page <= pages) {
            current_page++;
            readPage();
        }
    }


    public void printTop10(){
        int size = 10;
        ArrayList<Map.Entry<String, Integer>> maxEntry = new ArrayList<>();

        for (int i = 0; i < size; i++){
            maxEntry.add(null);
        }

        for (Map.Entry<String, Integer> entry : dictionary.entrySet()) {
            if (maxEntry.get(0) == null || entry.getValue().compareTo(maxEntry.get(0).getValue()) >= 0) {
                for (int i = size-1; i >= 1; i--){
                    maxEntry.set(i, maxEntry.get(i-1));
                }
                maxEntry.set(0, entry);
            }
        }

        System.out.println("\nTop 10 words");
        for (int i = 0; i < size; i++) {
            if (maxEntry.get(i) == null)
                break;
            System.out.println((maxEntry.get(i).getKey() + " = " + maxEntry.get(i).getValue()));
        }
    }

    public void printDict(){
        for (Map.Entry<String, Integer> entry : dictionary.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }


}
