package hometasks.calculator;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class CustomLogger {
    CustomLogger() {
        throw new IllegalStateException("Utility class");
    }

    private static final String DIR = "../src/hometasks/calculator";

    static String fileName = null;

    public static void newLogFile() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH.mm.ss dd-MM-yyyy");
        fileName = "log_" + dateFormat.format(date) + ".txt";
        File logs = new File(DIR, fileName);
        try {
            if (!logs.createNewFile())
                System.out.println("log file was not created");
        } catch (IOException e) {
            System.err.println("Error while creating log file for errors -_-");
        }
    }

    public static void newLog(String errorMsg, CustomException e) {
        System.err.println(errorMsg);
        try (Writer fileWriter = new FileWriter(new File(DIR, fileName), true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(errorMsg + '\n' + Arrays.toString(e.getStackTrace()));
        } catch (IOException ex) {
            System.err.println("Error while logging error -_-");
        }
    }
}
