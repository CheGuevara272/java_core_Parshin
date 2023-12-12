package hometasks.calculator;

import java.util.Arrays;

public class Vector extends Var implements Operation {
    private double[] vectorValue;

    public Vector(double[] value) {
        this.vectorValue = value;
    }

    public Vector(Vector vector) {
        this.vectorValue = vector.vectorValue;
    }

    public Vector(String strVector) {
        this.vectorValue = strToVector(strVector);
    }

    public double[] strToVector(String strVector) {
        String[] vector = strVector.substring(1, strVector.length() - 1).split("\\,\\s");
        return Arrays.stream(vector).mapToDouble(Double::parseDouble).toArray();
    }
}
