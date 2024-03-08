package hometasks.calculator;

import java.io.*;
import java.util.List;

public class CustomWriter {
//    CustomWriter() {
//        throw new IllegalStateException("Utility class");
//    }

    private static final String DIR = "../src/hometasks/calculator";

    public static void writeBufferedVar(String expression) throws CustomException {
        try (Writer fileWriter = new FileWriter(new File(DIR, "saved_expressions.txt"), true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(expression);
            bufferedWriter.newLine();
        } catch (IOException e) {
            throw new CustomException("", e);
        }
    }

    public static void removeLine(String line) throws CustomException {
        line = Validator.removeWhiteSpace(line);
        String finalLine = line;
        List<String> lines = CustomReader.readStream().filter(i -> !(i.equals(finalLine))).toList();
        CustomWriter.cleanFile();
        for (String item : lines)
            CustomWriter.writeBufferedVar(item);
    }

    public static void cleanFile() throws CustomException {
        try (Writer fileWriter = new FileWriter(new File(DIR, "saved_expressions.txt"), false)) {
            fileWriter.write("");
        } catch (IOException e) {
            throw new CustomException("Error while writing file", e);
        }
    }
}
