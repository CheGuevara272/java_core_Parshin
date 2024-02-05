package hometasks.calculator;

import java.util.Arrays;

public class Vector extends Var {
    public Double[] vectorValue;

    public Vector(Double[] value) {
        this.vectorValue = value;
    }

    public Vector(Vector vector) {
        this.vectorValue = vector.vectorValue;
    }

    public Vector(String strVector) {
        this.vectorValue = strToVector(strVector);
    }

    public Double[] strToVector(String strVector) {
        String[] vector = strVector.substring(1, strVector.length() - 1).split("\\,");
        return Arrays.stream(vector).map(Double::valueOf).toArray(Double[]::new);
    }

    public boolean sizeEquals(Vector vector) {
        return this.vectorValue.length == vector.vectorValue.length;
    }

    @Override
    public Vector sum(Var other) {
        Vector result = new Vector(this.vectorValue);
        if (other instanceof Vector vector) {
            for (int i = 0; i < this.vectorValue.length; i++) {
                result.vectorValue[i] = this.vectorValue[i] + vector.vectorValue[i];
            }
        }
        return result;
    }

    @Override
    public Vector subt(Var other) {
        Vector result = new Vector(this.vectorValue);
        if (other instanceof Vector vector) {
            for (int i = 0; i < this.vectorValue.length; i++) {
                result.vectorValue[i] = this.vectorValue[i] - vector.vectorValue[i];
            }
        }
        return result;
    }

    @Override
    public Vector mult(Var other) {
        Vector result = new Vector(this.vectorValue);
        if (other instanceof Vector vector) {
            for (int i = 0; i < this.vectorValue.length; i++) {
                result.vectorValue[i] = this.vectorValue[i] * vector.vectorValue[i];
            }
        } else if (other instanceof Scalar scalar) {
            for (int i = 0; i < this.vectorValue.length; i++) {
                result.vectorValue[i] = this.vectorValue[i] * scalar.scalarValue;
            }
        }
        return result;
    }

    @Override
    public Vector div(Var other) {
        Vector result = new Vector(this.vectorValue);
        if (other instanceof Vector vector) {
            for (int i = 0; i < this.vectorValue.length; i++) {
                result.vectorValue[i] = this.vectorValue[i] / vector.vectorValue[i];
            }
        } else if (other instanceof Scalar scalar) {
            for (int i = 0; i < this.vectorValue.length; i++) {
                result.vectorValue[i] = this.vectorValue[i] / scalar.scalarValue;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vector{");
        sb.append("vectorValue=").append(Arrays.toString(vectorValue));
        sb.append('}');
        return sb.toString();
    }
}
