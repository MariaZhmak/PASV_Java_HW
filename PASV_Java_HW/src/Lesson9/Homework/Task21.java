package Lesson9.Homework;

public class Task21 {
    /*
    Напишите три цикла выполняющих многократное сложение строк, один с
    помощью оператора сложения и String, другой с помощью StringBuilder и метода
    append, а также аналогино для StringBuffer. Сравните скорость их выполнения.
     */

    public static void main(String[] args) {
        long start1 = System.nanoTime();

        String string = "";
        for (int i = 0; i < 1000; i++) {
            string += "String";
        }

        long end1 = System.nanoTime();
        System.out.println("Elapsed time LoopString: " + (end1 - start1) / 1e6 + " ms");

        System.out.println(" ");

        long start2 = System.nanoTime();

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            builder.append("String");
        }

        long end2 = System.nanoTime();
        System.out.println("Elapsed time LoopStringBuilder: " + (end2 - start2) / 1e6 + " ms");

        System.out.println(" ");

        long start3 = System.nanoTime();

        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < 1000; i++) {
            buffer.append("String");
        }

        long end3 = System.nanoTime();
        System.out.println("Elapsed time LoopStringBuffer: " + (end3 - start3) / 1e6 + " ms");


    }

}
