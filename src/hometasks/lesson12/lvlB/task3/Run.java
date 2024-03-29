package hometasks.lesson12.lvlB.task3;

import java.io.*;

/*Напишите метод, который принимает на вход строку и записывает её в файл в папке текущей задачи.
  Создайте класс Run и в методе main напишите код, который передаёт в метод по одному слову
  (все слова разные) для записи в файл. Считайте из созданного файла записанную информацию
  и выведите её в консоль.*/

public class Run {
    private static final String DIR = "../src/hometasks/lesson12/lvlB/task3";

    public static void main(String[] args) {
        writeBufferedText("Привет, ", false);
        writeBufferedText("меня не зовут", true);
        writeBufferedText(" Артём", true);
        readBufferedText();
    }

    private static void writeBufferedText(String text, boolean append) {
        try (Writer fileWriter = new FileWriter(new File(DIR, "text.txt"), append);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(text);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static void readBufferedText() {
        try (FileReader fileReader = new FileReader(new File(DIR, "text.txt"));
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
