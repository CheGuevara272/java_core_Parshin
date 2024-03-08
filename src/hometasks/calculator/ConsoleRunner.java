package hometasks.calculator;

import java.util.Scanner;

public class ConsoleRunner {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        CustomLogger.newLogFile();
        String expression = null;
        while (!("end".equals(expression))) {
            System.out.println("Сохранённые переменные: ");
            try {
                CustomReader.readBufferedVar();
            } catch (CustomException e) {
                CustomLogger.newLog(e.getMessage(), e);
            }
            System.out.println("Введите выражение, или одну из следующих операций: " +
                    "\n1. printvar" +
                    "\n2. save" +
                    "\n3. clean file" +
                    "\n4. remove line" +
                    "\n5. end");
            expression = scanner.nextLine();
            expression = Validator.removeWhiteSpace(expression);
            try {
                switch (expression) {
                    case ("printvar"), ("1") -> {
                        CustomTaskManager.print();
                        continue;
                    }
                    case ("save"), ("2") -> {
                        CustomTaskManager.save();
                        continue;
                    }
                    case ("clean file"), ("3") -> {
                        CustomTaskManager.clean();
                        continue;
                    }
                    case ("remove line"), ("4") -> {
                        CustomTaskManager.remove();
                        continue;
                    }
                    case ("end"), ("5"), ("") -> {
                        continue;
                    }
                }
                CustomTaskManager.calculate(expression);
            } catch (CustomException e) {
                CustomLogger.newLog(e.getMessage(), e);
            }
        }
    }
}
