package hometasks.lesson12.lvlB.task2;

import java.io.*;

/*Напишите метод, который берёт стихотворение из файла versh.txt и выводит его в консоль.
  Напишите метод, который берёт стихотворение из файла bufVersh.txt и выводит его в консоль.
  Создайте класс Run и в методе main проверьте скорость работы двух методов.*/

public class Run {
    private static final String DIR = "../java_core_group00/src/hometasks/lesson12/lvlB/task1";

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        readText();
        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time of fileReader: " + (endTime - startTime) + '\n');
        startTime = System.currentTimeMillis();
        readBufferedText();
        endTime = System.currentTimeMillis();
        System.out.println("Total execution time of bufferedReader: " + (endTime - startTime));
    }

    private static void readText() {
        try (Reader fileReader = new FileReader(new File(DIR, "versh.txt"))) {
            int code;
            while ((code = fileReader.read()) != -1) {
                System.out.print(Character.toChars(code));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static void readBufferedText() {
        try (FileReader fileReader = new FileReader(new File(DIR, "bufVersh.txt"));
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
