package hometasks.lesson12.lvlB.task1;

import hometasks.appendix.Versh;

import java.io.*;

/*Напишите метод, который берёт стихотворение из класса Versh и записывает его в файл versh.txt в текущую папку задачи.
  Напишите метод, который берёт стихотворение из класса Versh и записывает его в файл bufVersh.txt в текущую папку задачи.
  Создайте класс Run и в методе main проверьте скорость работы двух методов.*/

public class Run {
    private static final String DIR = "../src/hometasks/lesson12/lvlB/task1";

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        writeText(Versh.versh);
        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time of fileWriter: " + (endTime - startTime));
        startTime = System.currentTimeMillis();
        writeBufferedText(Versh.versh);
        endTime = System.currentTimeMillis();
        System.out.println("Total execution time of bufferedWriter: " + (endTime - startTime));
    }

    private static void writeText(String text) {
        try (Writer fileWriter = new FileWriter(new File(DIR, "versh.txt"))) {
            for (int i = 0; i < text.length(); i++) {
                fileWriter.write(text.charAt(i));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static void writeBufferedText(String text) {
        try (Writer fileWriter = new FileWriter(new File(DIR, "bufVersh.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(text);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
