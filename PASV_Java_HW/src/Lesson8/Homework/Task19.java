package Lesson8.Homework;

import java.util.StringTokenizer;

public class Task19 {
    /*
    Имеется строка с текстом. Подсчитать количество слов в тексте.
    Желательно учесть, что слова могут разделяться несколькими пробелами,
    в начале и конце текста также могут быть пробелы, но могут и отсутствовать.
     */
    public static void main(String[] args) {
        String text = "Строковый литерал - это последовательность символов, заключенных в двойных кавычках.";


        StringTokenizer stringTokenizer = new StringTokenizer(text);
        StringTokenizer stringSings = new StringTokenizer("-" , " ");


        int words = stringTokenizer.countTokens();
        int signs = stringSings.countTokens();
        System.out.println("Количество слов в тексе: " + (words - signs));

    }

}
