package Lesson8.Homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task20 {
    /*
    Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.
     */
    public static void main(String[] args) {
        String text = "Строковый литерал - это последовательность символов, заключенных в двойных кавычках.";

        String regexp = "([а-яА-Я]+)|([a-zA-Z]+)";
        StringBuilder rezult = new StringBuilder();

        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            rezult.append(text.substring(matcher.end() - 1, matcher.end()));
        }

        System.out.println("Последние буквы текста: " + rezult);
    }

}
