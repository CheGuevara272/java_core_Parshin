package hometasks.calculator;

import java.util.Scanner;

public class CustomTaskManager {
    private static final Scanner scanner = new Scanner(System.in);

    CustomTaskManager() {
        throw new IllegalStateException("Utility class");
    }

    static void print() {
        CustomSaver.printVar();
    }

    static void save() throws CustomException {
        System.out.println("Введите переменную, которую хотите сохранить в файл: ");
        String expression = scanner.nextLine();
        expression = Validator.removeWhiteSpace(expression);
        if (Validator.validateOperand(expression))
            CustomWriter.writeBufferedVar(expression);
    }

    static void clean() throws CustomException {
        CustomWriter.cleanFile();
    }

    static void remove() throws CustomException {
        System.out.println("Введите номер строки, которую хотите удалить из файла: ");
        String line = scanner.nextLine();
        CustomWriter.removeLine(line);
    }

    static void calculate(String expression) throws CustomException {
        char sing;
        Var var1;
        Var var2;

        sing = Validator.determineOperation(expression);
        var1 = Validator.determineFirstVar(expression, sing);
        var2 = Validator.determineSecondVar(expression, sing);
        Validator.checkClass(var1, var2);
        switch (sing) {
            case ('+') -> System.out.println(var1.sum(var2));
            case ('-') -> System.out.println(var1.subt(var2));
            case ('*') -> System.out.println(var1.mult(var2));
            case ('/') -> System.out.println(var1.div(var2));
            case ('=') -> CustomSaver.save(expression);
        }
    }
}
