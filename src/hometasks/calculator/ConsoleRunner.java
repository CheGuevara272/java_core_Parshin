package hometasks.calculator;

import java.util.Scanner;

public class ConsoleRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = null;
        CustomSaver customSaver = new CustomSaver();
        while (!("end".equals(expression))) {
            System.out.println("Сохранённые переменные: ");
            CustomReader.readBufferedVar();
            System.out.println("Введите выражение, или одну из следующих операций: " +
                    "\n1. printvar" +
                    "\n2. save" +
                    "\n3. clean file" +
                    "\n4. end");
            expression = scanner.nextLine();
            expression = Validator.removeWhiteSpace(expression);
            switch (expression) {
                case ("printvar"), ("1") -> {
                    customSaver.printVar();
                    continue;
                }
                case ("save"), ("2") -> {
                    System.out.println("Введите переменную, которую хотите сохранить в файл: ");
                    expression = scanner.nextLine();
                    expression = Validator.removeWhiteSpace(expression);
                    try {
                        if (Validator.validateOperand(expression)) CustomWriter.writeBufferedVar(expression);
                    } catch (CustomException e) {
                        System.err.println(e.getMessage());
                    }
                    continue;
                }
                case ("clean file"), ("3") -> {
                    CustomWriter.cleanFile();
                    continue;
                }
                case ("end"), ("4"), ("") -> {
                    continue;
                }
            }
            char sing;
            Var var1;
            Var var2;
            try {
                sing = Validator.determineOperation(expression);
                var1 = Validator.determineFirstVar(expression, sing);
                var2 = Validator.determineSecondVar(expression, sing);
                Validator.checkClass(var1, var2);
                switch (sing) {
                    case ('+') -> System.out.println(var1.sum(var2));
                    case ('-') -> System.out.println(var1.subt(var2));
                    case ('*') -> System.out.println(var1.mult(var2));
                    case ('/') -> System.out.println(var1.div(var2));
                    case ('=') -> customSaver.save(expression);
                }
            } catch (CustomException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
