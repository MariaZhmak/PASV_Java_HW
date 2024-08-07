package Lesson10.Homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task23 {
    /*
    Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у которых
    есть параметры, например <p id=”p1”>, и замену их на простые теги абзацев <p>.
     */

    public static void main(String[] args) {

        String input = "<html><body><p>Первый абзац.</p><p id=\"p1\">Второй абзац с параметром.</p><p class=\"text\">Третий абзац с другим параметром.</p></body></html>";

        String paragraphPattern = "<p\\b[^>]*>";

        Pattern pattern = Pattern.compile(paragraphPattern);
        Matcher matcher = pattern.matcher(input);

        String result = matcher.replaceAll("<p>");

        System.out.println("Исходная строка:");
        System.out.println(input);
        System.out.println("\nРезультирующая строка:");
        System.out.println(result);

    }
}
