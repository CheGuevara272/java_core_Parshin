package hometasks.calculator;

import java.util.Arrays;

public class Matrix extends Var implements Operation<Var> {

    public Double[][] matrixValue;

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
    public void sum(Var var) {
        if (var instanceof Matrix) {
            if (((Matrix) var).matrixValue.length == this.matrixValue.length && ((Matrix) var).matrixValue[0].length == this.matrixValue[0].length) {
                for (int row = 0; row < this.matrixValue.length; row++) {
                    for (int col = 0; col < this.matrixValue[0].length; col++) {
                        this.matrixValue[row][col] += ((Matrix) var).matrixValue[row][col];
                    }
                }
            }
        } else {

        }
    }

    @Override
    public void subt(Var var) {
        if (var instanceof Matrix) {
            if (((Matrix) var).matrixValue.length == this.matrixValue.length && ((Matrix) var).matrixValue[0].length == this.matrixValue[0].length) {
                for (int row = 0; row < this.matrixValue.length; row++) {
                    for (int col = 0; col < this.matrixValue[0].length; col++) {
                        this.matrixValue[row][col] -= ((Matrix) var).matrixValue[row][col];
                    }
                }
            }
        } else {

        }
    }

    @Override
    public void mult(Var var) {
        if (var instanceof Matrix) {
            if (((Matrix) var).matrixValue.length == this.matrixValue.length && ((Matrix) var).matrixValue[0].length == this.matrixValue[0].length) {
                for (int row = 0; row < this.matrixValue.length; row++) {
                    for (int col = 0; col < this.matrixValue[0].length; col++) {
                        this.matrixValue[row][col] += ((Matrix) var).matrixValue[row][col];
                    }
                }
            }
        } else if (var instanceof Scalar) {
            for (int row = 0; row < this.matrixValue.length; row++) {
                for (int col = 0; col < this.matrixValue[0].length; col++) {
                    this.matrixValue[row][col] = this.matrixValue[row][col] * ((Scalar) var).scalarValue;
                }
            }
        } else {

        }
    }

    @Override
    public void div(Var var) {
        if (var instanceof Matrix) {
            if (((Matrix) var).matrixValue.length == this.matrixValue.length && ((Matrix) var).matrixValue[0].length == this.matrixValue[0].length) {
                for (int row = 0; row < this.matrixValue.length; row++) {
                    for (int col = 0; col < this.matrixValue[0].length; col++) {
                        this.matrixValue[row][col] += ((Matrix) var).matrixValue[row][col];
                    }
                }
            }
        } else if (var instanceof Scalar) {
            for (int row = 0; row < this.matrixValue.length; row++) {
                for (int col = 0; col < this.matrixValue[0].length; col++) {
                    this.matrixValue[row][col] = this.matrixValue[row][col] / ((Scalar) var).scalarValue;
                }
            }
        } else {

        }
    }
}
