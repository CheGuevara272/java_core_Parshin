package hometasks.calculator;

import java.util.Arrays;

public class Matrix extends Var implements Operation<Double[][]> {

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
        return Arrays.stream(vectors).
                map(s -> Arrays.stream(s.split("\\,\\s")).
                        map(Double::parseDouble).toArray(Double[]::new)).
                toArray(Double[][]::new);
    }

    @Override
    public Double[][] sum(Double[][] t1, Double[][] t2) {
        return new Double[0][];
    }

    @Override
    public Double[][] subt(Double[][] t1, Double[][] t2) {
        return new Double[0][];
    }

    @Override
    public Double[][] mult(Double[][] t1, Double[][] t2) {
        return new Double[0][];
    }

    @Override
    public Double[][] div(Double[][] t1, Double[][] t2) {
        return new Double[0][];
    }
}
