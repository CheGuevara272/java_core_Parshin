package hometasks.lesson12.lvlA.task2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*Создайте класс Run и в методе main напишите код, который считывает стихотворение
  из файла versh.txt и выводит его в консоль.Создайте класс Run и в методе main напишите код,
  который считывает стихотворение из файла versh.txt и выводит его в консоль.*/

public class Run {
    private static final String DIR = "../src/hometasks/lesson12/lvlA/task1";

    public static void main(String[] args) {
        readText();
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
}
