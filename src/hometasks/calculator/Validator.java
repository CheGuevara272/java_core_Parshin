package hometasks.calculator;

public class Validator {

    private static final String SCALAR_PATTERN = "^(\\-|)\\d+$";
    private static final String VECTOR_PATTERN = "^\\{((\\-|)\\d+\\,)+(\\-|)\\d+\\}$";
    private static final String MATRIX_PATTERN = "^\\{(\\{((\\-|)\\d+\\,)+(\\-|)\\d+\\}\\,)+\\{((\\-|)\\d+\\,)+(\\-|)\\d+\\}\\}$";

    static String removeWhiteSpace(String expression) {
        return expression.replaceAll(" ", "");
    }

    static char determineOperation(String expression) {
        char[] operations = {'+', '-', '*', '/', '='};
        char sing = 0;
        for (int i = 0; i < operations.length; i++) {
            if (expression.indexOf(operations[i]) != -1) {
                sing = operations[i];
            }
        }
        return sing;
    }

    static Var determineFirstVar(String expression, char sing) {
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

    static Var determineSecondVar(String expression, char sing) {
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
