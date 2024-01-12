package hometasks.calculator;

import java.util.Arrays;

public class Vector extends Var implements Operation<Double[]> {
    private Double[] vectorValue;

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
    public Double[] sum(Double[] t1, Double[] t2) {
        Double[] vectorSum = new Double[t1.length];
        for (int i = 0; i < t1.length; i++) {
            vectorSum[i] = t1[i] + t2[i];
        }
        return vectorSum;
    }

    @Override
    public Double[] subt(Double[] t1, Double[] t2) {
        Double[] vectorSum = new Double[t1.length];
        for (int i = 0; i < t1.length; i++) {
            vectorSum[i] = t1[i] - t2[i];
        }
        return vectorSum;
    }

    @Override
    public Double[] mult(Double[] t1, Double[] t2) {
        Double[] vectorSum = new Double[t1.length];
        for (int i = 0; i < t1.length; i++) {
            vectorSum[i] = t1[i] * t2[i];
        }
        return vectorSum;
    }

    @Override
    public Double[] div(Double[] t1, Double[] t2) {
        Double[] vectorSum = new Double[t1.length];
        for (int i = 0; i < t1.length; i++) {
            vectorSum[i] = t1[i] / t2[i];
        }
        return vectorSum;
    }
}
