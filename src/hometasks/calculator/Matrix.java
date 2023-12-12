package hometasks.calculator;

import java.util.Arrays;

public class Matrix extends Var implements Operation {

    private Double[][] matrixValue;

    public Matrix(Double[][] value) {
        this.matrixValue = value;
    }

    public Matrix(Matrix matrix) {
        this.matrixValue = matrix.matrixValue;
    }

    public Matrix(String strMatrix) {
        this.matrixValue = strToMatrix(strMatrix);
    }

    public Double[][] strToMatrix(String strMatrix) {
        String[] vectors = strMatrix.substring(2, strMatrix.length() - 2/*3*/).split("\\}\\,\\s\\{");
        return Arrays.stream(strMatrix.substring(2, strMatrix.length() - 2).split("\\}\\,\\s\\{")).
                map(s -> Arrays.stream(s.split("\\,\\s")).
                        map(Double::parseDouble).toArray(Double[]::new)).
                toArray(Double[][]::new);
    }
}
