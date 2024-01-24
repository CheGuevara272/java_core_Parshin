package hometasks.calculator;

import java.util.Scanner;

public class ConsoleRunner {
    private static final String SCALAR_PATTERN = "^(\\-|)\\d+$";
    private static final String VECTOR_PATTERN = "^\\{((\\-|)\\d+\\,)+(\\-|)\\d+\\}$";
    private static final String MATRIX_PATTERN = "^\\{(\\{((\\-|)\\d+\\,)+(\\-|)\\d+\\}\\,)+\\{((\\-|)\\d+\\,)+(\\-|)\\d+\\}\\}$";


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = null;
        Saver saver = new Saver();
        while (!("end".equals(expression))) {
            System.out.println("Введите выражение: ");
            expression = scanner.nextLine();
            expression = removeWhiteSpace(expression);
            switch (expression) {
                case ("printvar") -> {
                    saver.printVar();
                    continue;
                }
                case ("end"), ("") -> {
                    continue;
                }
            }
            char sing = determineOperation(expression);
            Var var = determineFirstVar(expression, sing);
            switch (sing) {
                case ('+') -> System.out.println(var.sum(determineSecondVar(expression, sing)));
                case ('-') -> System.out.println(var.subt(determineSecondVar(expression, sing)));
                case ('*') -> System.out.println(var.mult(determineSecondVar(expression, sing)));
                case ('/') -> System.out.println(var.div(determineSecondVar(expression, sing)));
                case ('=') -> saver.save(expression);
            }
        }
    }

    private static String removeWhiteSpace(String expression) {
        return expression.replaceAll(" ", "");
    }

    private static char determineOperation(String expression) {
        char[] operations = {'+', '-', '*', '/', '='};
        char sing = 0;
        for (int i = 0; i < operations.length; i++) {
            if (expression.indexOf(operations[i]) != -1) {
                sing = operations[i];
            }
        }
        return sing;
    }

    private static Var determineFirstVar(String expression, char sing) {
        String firstOperand = expression.substring(0, expression.indexOf(sing));
        if (firstOperand.matches(SCALAR_PATTERN)) {
            return new Scalar(firstOperand);
        } else if (firstOperand.matches(VECTOR_PATTERN)) {
            return new Vector(firstOperand);
        } else if (firstOperand.matches(MATRIX_PATTERN)) {
            return new Matrix(firstOperand);
        } else {
            return null;
        }
    }

    private static Var determineSecondVar(String expression, char sing) {
        String secondOperand = expression.substring(expression.indexOf(sing) + 1);
        if (secondOperand.matches(SCALAR_PATTERN)) {
            return new Scalar(secondOperand);
        } else if (secondOperand.matches(VECTOR_PATTERN)) {
            return new Vector(secondOperand);
        } else if (secondOperand.matches(MATRIX_PATTERN)) {
            return new Matrix(secondOperand);
        } else {
            return null;
        }
    }
}
