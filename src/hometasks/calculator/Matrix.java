package hometasks.calculator;

import java.util.Arrays;

public class Matrix extends Var {

    public Double[][] matrixValue;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Matrix{");
        sb.append("matrixValue=");
        for (int i = 0; i < matrixValue.length; i++) {
            sb.append(Arrays.toString(matrixValue[i]));
        }
        sb.append('}');
        return sb.toString();
    }

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
        String[] vectors = strMatrix.substring(2, strMatrix.length() - 2/*3*/).split("\\}\\,\\{");
        return Arrays.stream(vectors).
                map(s -> Arrays.stream(s.split("\\,")).
                        map(Double::parseDouble).toArray(Double[]::new)).
                toArray(Double[][]::new);
    }

    @Override
    public Matrix sum(Var other) {
        Matrix result = new Matrix(this.matrixValue);
        if (other instanceof Matrix) {
            if (((Matrix) other).matrixValue.length == this.matrixValue.length && ((Matrix) other).matrixValue[0].length == this.matrixValue[0].length) {
                for (int row = 0; row < this.matrixValue.length; row++) {
                    for (int col = 0; col < this.matrixValue[0].length; col++) {
                        result.matrixValue[row][col] = this.matrixValue[row][col] + ((Matrix) other).matrixValue[row][col];
                    }
                }
            }
        } else {

        }
        return result;
    }

    @Override
    public Matrix subt(Var other) {
        Matrix result = new Matrix(this.matrixValue);
        if (other instanceof Matrix) {
            if (((Matrix) other).matrixValue.length == this.matrixValue.length && ((Matrix) other).matrixValue[0].length == this.matrixValue[0].length) {
                for (int row = 0; row < this.matrixValue.length; row++) {
                    for (int col = 0; col < this.matrixValue[0].length; col++) {
                        result.matrixValue[row][col] = this.matrixValue[row][col] - ((Matrix) other).matrixValue[row][col];
                    }
                }
            }
        } else {

        }
        return result;
    }

    @Override
    public Matrix mult(Var other) {
        Matrix result = new Matrix(this.matrixValue);
        if (other instanceof Matrix) {
            if (((Matrix) other).matrixValue.length == this.matrixValue.length && ((Matrix) other).matrixValue[0].length == this.matrixValue[0].length) {
                for (int row = 0; row < this.matrixValue.length; row++) {
                    for (int col = 0; col < this.matrixValue[0].length; col++) {
                        result.matrixValue[row][col] = this.matrixValue[row][col] * ((Matrix) other).matrixValue[row][col];
                    }
                }
            }
        } else if (other instanceof Scalar) {
            for (int row = 0; row < this.matrixValue.length; row++) {
                for (int col = 0; col < this.matrixValue[0].length; col++) {
                    result.matrixValue[row][col] = this.matrixValue[row][col] * ((Scalar) other).scalarValue;
                }
            }
        } else {

        }
        return result;
    }

    @Override
    public Matrix div(Var other) {
        Matrix result = new Matrix(this.matrixValue);
        if (other instanceof Matrix) {
            if (((Matrix) other).matrixValue.length == this.matrixValue.length && ((Matrix) other).matrixValue[0].length == this.matrixValue[0].length) {
                for (int row = 0; row < this.matrixValue.length; row++) {
                    for (int col = 0; col < this.matrixValue[0].length; col++) {
                        result.matrixValue[row][col] = this.matrixValue[row][col] / ((Matrix) other).matrixValue[row][col];
                    }
                }
            }
        } else if (other instanceof Scalar) {
            for (int row = 0; row < this.matrixValue.length; row++) {
                for (int col = 0; col < this.matrixValue[0].length; col++) {
                    result.matrixValue[row][col] = this.matrixValue[row][col] / ((Scalar) other).scalarValue;
                }
            }
        } else {

        }
        return result;
    }
}
