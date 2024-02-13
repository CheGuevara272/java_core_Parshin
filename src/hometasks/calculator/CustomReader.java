package hometasks.calculator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CustomReader {
    private static final String DIR = "../java_core_group00/src/hometasks/calculator";

    public static void readBufferedVar() {
        try (FileReader fileReader = new FileReader(new File(DIR, "saved_expressions.txt"));
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
