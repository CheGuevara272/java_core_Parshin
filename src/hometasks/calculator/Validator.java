package hometasks.calculator;

public class Validator {
    private static final String SCALAR_PATTERN = "^(\\-|)\\d+$";
    private static final String VECTOR_PATTERN = "^\\{((\\-|)\\d+\\,)+(\\-|)\\d+\\}$";
    private static final String MATRIX_PATTERN = "^\\{(\\{((\\-|)\\d+\\,)+(\\-|)\\d+\\}\\,)+\\{((\\-|)\\d+\\,)+(\\-|)\\d+\\}\\}$";

    private Validator() {
        throw new IllegalStateException("Utility class");
    }

    static String removeWhiteSpace(String expression) {
        return expression.replaceAll("\\s", "");
    }

    static boolean validateOperand(String expression) throws CustomException {
        if (expression.matches(SCALAR_PATTERN) || expression.matches(VECTOR_PATTERN) || expression.matches(MATRIX_PATTERN)) {
            return true;
        } else {
            throw new CustomException("Operand does not match syntax and can not be saved");
        }
    }

    static char determineOperation(String expression) throws CustomException {
        char[] operations = {'+', '-', '*', '/', '='};
        char sing = 0;
        for (int i = 0; i < operations.length; i++) {
            if (expression.indexOf(operations[i]) != -1) sing = operations[i];
        }
        if (sing == 0) {
            throw new CustomException("Expression does not match syntax");
        } else {
            return sing;
        }
    }

    static Var determineFirstVar(String expression, char sing) throws CustomException {
        String firstOperand = expression.substring(0, expression.indexOf(sing));
        if (firstOperand.matches(SCALAR_PATTERN)) {
            return new Scalar(firstOperand);
        } else if (firstOperand.matches(VECTOR_PATTERN)) {
            return new Vector(firstOperand);
        } else if (firstOperand.matches(MATRIX_PATTERN)) {
            return new Matrix(firstOperand);
        } else {
            throw new CustomException("First operand does not match any pattern");
        }
    }

    static Var determineSecondVar(String expression, char sing) throws CustomException {
        String secondOperand = expression.substring(expression.indexOf(sing) + 1);
        if (secondOperand.matches(SCALAR_PATTERN)) {
            return new Scalar(secondOperand);
        } else if (secondOperand.matches(VECTOR_PATTERN)) {
            return new Vector(secondOperand);
        } else if (secondOperand.matches(MATRIX_PATTERN)) {
            return new Matrix(secondOperand);
        } else {
            throw new CustomException("Second operand does not match any pattern");
        }
    }

    static void checkClass(Var firstVar, Var secondVar) throws CustomException {
        if (firstVar.getClass().equals(secondVar.getClass())) {
            sizeEquals(firstVar, secondVar);
        } else if (secondVar.getClass() != Scalar.class) {
            throw new CustomException("Operation on these operands is impossible");
        }
    }

    private static void sizeEquals(Var firstVar, Var secondVar) throws CustomException {
        if (firstVar instanceof Vector vector1 && secondVar instanceof Vector vector2 && (!vector1.sizeEquals(vector2))) {
            throw new CustomException("Vectors are not the same size");
        } else if (firstVar instanceof Matrix matrix1 && secondVar instanceof Matrix matrix2 && (!matrix1.sizeEquals(matrix2))) {
            throw new CustomException("Matrices are not the same size");
        }
    }
}
