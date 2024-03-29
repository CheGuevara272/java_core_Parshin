package hometasks.calculator;

import java.util.Arrays;

public class Matrix extends Var {

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
        String[] vectors = strMatrix.substring(2, strMatrix.length() - 2/*3*/).split("\\}\\,\\{");
        return Arrays.stream(vectors).
                map(s -> Arrays.stream(s.split("\\,")).
                        map(Double::parseDouble).toArray(Double[]::new)).
                toArray(Double[][]::new);
    }

    public boolean sizeEquals(Matrix matrix) {
        boolean result = true;
        if (this.matrixValue.length == matrix.matrixValue.length) {
            for (int i = 0; i < this.matrixValue.length; i++) {
                result = this.matrixValue[i].length == matrix.matrixValue[i].length;
                if (!result) {
                    break;
                }
            }
        }
        return result;
    }

    @Override
    public Matrix sum(Var other) {
        Matrix result = new Matrix(this.matrixValue);
        if (other instanceof Matrix matrix && matrix.matrixValue.length == this.matrixValue.length && matrix.matrixValue[0].length == this.matrixValue[0].length) {
            for (int row = 0; row < this.matrixValue.length; row++) {
                for (int col = 0; col < this.matrixValue[0].length; col++) {
                    result.matrixValue[row][col] = this.matrixValue[row][col] + matrix.matrixValue[row][col];
                }
            }

        }
        return result;
    }

    @Override
    public Matrix subt(Var other) {
        Matrix result = new Matrix(this.matrixValue);
        if (other instanceof Matrix matrix && matrix.matrixValue.length == this.matrixValue.length && matrix.matrixValue[0].length == this.matrixValue[0].length) {
            for (int row = 0; row < this.matrixValue.length; row++) {
                for (int col = 0; col < this.matrixValue[0].length; col++) {
                    result.matrixValue[row][col] = this.matrixValue[row][col] - matrix.matrixValue[row][col];
                }
            }

        }
        return result;
    }

    @Override
    public Matrix mult(Var other) {
        Matrix result = new Matrix(this.matrixValue);
        if (other instanceof Matrix matrix && matrix.matrixValue.length == this.matrixValue.length && matrix.matrixValue[0].length == this.matrixValue[0].length) {
            for (int row = 0; row < this.matrixValue.length; row++) {
                for (int col = 0; col < this.matrixValue[0].length; col++) {
                    result.matrixValue[row][col] = this.matrixValue[row][col] * matrix.matrixValue[row][col];
                }
            }
        } else if (other instanceof Scalar scalar) {
            for (int row = 0; row < this.matrixValue.length; row++) {
                for (int col = 0; col < this.matrixValue[0].length; col++) {
                    result.matrixValue[row][col] = this.matrixValue[row][col] * scalar.scalarValue;
                }
            }
        }
        return result;
    }

    @Override
    public Matrix div(Var other) throws CustomException {
        Matrix result = new Matrix(this.matrixValue);
        if (other instanceof Matrix) {
            throw new CustomException("There is no such operation as division for two matrices. You can divide only by scalar");
        } else if (other instanceof Scalar scalar) {
            if (scalar.scalarValue == 0) throw new CustomException("You can not divide by 0");
            for (int row = 0; row < this.matrixValue.length; row++) {
                for (int col = 0; col < this.matrixValue[0].length; col++) {
                    result.matrixValue[row][col] = this.matrixValue[row][col] / scalar.scalarValue;
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Matrix{");
        sb.append("matrixValue=");
        for (Double[] doubles : matrixValue) {
            sb.append(Arrays.toString(doubles));
        }
        sb.append('}');
        return sb.toString();
    }
}
