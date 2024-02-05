package hometasks.calculator;

import java.util.Scanner;

public class ConsoleRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = null;
        Saver saver = new Saver();
        while (!("end".equals(expression))) {
            System.out.println("Введите выражение: ");
            expression = scanner.nextLine();
            expression = Validator.removeWhiteSpace(expression);
            switch (expression) {
                case ("printvar") -> {
                    saver.printVar();
                    continue;
                }
                case ("end"), ("") -> {
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
                    case ('=') -> saver.save(expression);
                }
            } catch (CustomException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
