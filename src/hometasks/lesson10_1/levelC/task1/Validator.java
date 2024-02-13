package hometasks.lesson10_1.levelC.task1;

public class Validator {
    public boolean validateBrackets(String expression) {
        int counterOne = 0;
        int counterTwo = 0;
        int counterThree = 0;
        char[] exp = expression.toCharArray();
        for (int i = 0; i < exp.length; i++) {
            switch (exp[i]) {
                case ('(') -> {
                    if (checkNext(exp[i + 1])) {
                        return false;
                    }
                    counterOne++;
                }
                case (')') -> counterOne--;
                case ('{') -> {
                    if (checkNext(exp[i + 1])) {
                        return false;
                    }
                    counterTwo++;
                }
                case ('}') -> counterTwo--;
                case ('[') -> {
                    if (checkNext(exp[i + 1])) {
                        return false;
                    }
                    counterThree++;
                }
                case (']') -> counterThree--;
            }
        }
        return counterOne == 0 && counterTwo == 0 && counterThree == 0;
    }

    private boolean checkNext(char next) {
        return next == '*' || next == '/' || next == '=';
    }
}
