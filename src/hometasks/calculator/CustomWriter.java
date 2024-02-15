package hometasks.calculator;

import java.io.*;

public class CustomWriter {
    private static final String DIR = "../java_core_group00/src/hometasks/calculator";

    public static void writeBufferedVar(String expression) {
        try (Writer fileWriter = new FileWriter(new File(DIR, "saved_expressions.txt"), true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(expression);
            bufferedWriter.newLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void removeLine(int lineNum) {
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
            for (int i = 0; i < lineNum; i++)
                br.readLine();
            line = br.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void removeLine(String line) {

    }

    public static void cleanFile() {
        try (Writer fileWriter = new FileWriter(new File(DIR, "saved_expressions.txt"), false)) {
            fileWriter.write("");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
