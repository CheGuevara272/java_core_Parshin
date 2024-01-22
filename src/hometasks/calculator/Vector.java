package hometasks.calculator;

import java.util.Arrays;

public class Vector extends Var implements Operation<Var> {
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
        String[] vector = strVector.substring(1, strVector.length() - 1).split("\\,\\s");
        return Arrays.stream(vector).map(Double::valueOf).toArray(Double[]::new);
    }

    @Override
    public void sum(Var var) {
        if (var instanceof Vector) {
            for (int i = 0; i < this.vectorValue.length; i++) {
                this.vectorValue[i] += ((Vector) var).vectorValue[i];
            }
        } else {

        }
    }

    @Override
    public void subt(Var var) {
        if (var instanceof Vector) {
            for (int i = 0; i < this.vectorValue.length; i++) {
                this.vectorValue[i] -= ((Vector) var).vectorValue[i];
            }
        } else {

        }
    }

    @Override
    public void mult(Var var) {
        if (var instanceof Vector) {
            for (int i = 0; i < this.vectorValue.length; i++) {
                this.vectorValue[i] *= ((Vector) var).vectorValue[i];
            }
        } else {

        }
    }

    @Override
    public void div(Var var) {
        if (var instanceof Vector) {
            for (int i = 0; i < this.vectorValue.length; i++) {
                this.vectorValue[i] /= ((Vector) var).vectorValue[i];
            }
        } else {

        }
    }
}
