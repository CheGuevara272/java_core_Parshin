package hometasks.calculator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class CustomReader {
    CustomReader() {
        throw new IllegalStateException("Utility class");
    }

    private static final String DIR = "../src/hometasks/calculator";

    public static void readBufferedVar() throws CustomException {
        try (FileReader fileReader = new FileReader(new File(DIR, "saved_expressions.txt"));
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new CustomException("Error while reading file", e);
        }
    }

    public static Stream<String> readStream() throws CustomException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(DIR, "saved_expressions.txt")))) {
            return bufferedReader.lines();
        } catch (IOException e) {
            throw new CustomException("Error while reading file", e);
        }
    }
}
