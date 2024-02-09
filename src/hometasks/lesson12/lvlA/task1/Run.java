package hometasks.lesson12.lvlA.task1;

import hometasks.appendix.Versh;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*Создайте класс Run и в методе main напишите код, который берёт стихотворение из класса Versh и записывает его в файл versh.txt.*/

public class Run {
    private static final String DIR = "../java_core_group00/src/hometasks/lesson12/lvlA/task1";

    public static void main(String[] args) {
        writeText(Versh.versh);
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
}
