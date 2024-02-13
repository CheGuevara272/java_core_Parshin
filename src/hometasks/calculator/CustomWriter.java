package hometasks.calculator;

import java.io.*;

public class CustomWriter {
    private static final String DIR = "../java_core_group00/src/hometasks/calculator";

    public static void writeBufferedVar(String expression) {
        try (Writer fileWriter = new FileWriter(new File(DIR, "saved_expressions.txt"), true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(expression);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void cleanFile() {
        try (Writer fileWriter = new FileWriter(new File(DIR, "saved_expressions.txt"), false)) {
            fileWriter.write("");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
