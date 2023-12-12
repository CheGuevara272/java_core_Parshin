package hometasks.calculator;

public class Scalar extends Var implements Operation {
    private double scalarValue;

    public Scalar(double value) {
        this.scalarValue = value;
    }

    public Scalar(Scalar scalar) {
        this.scalarValue = scalar.scalarValue;
    }

    public Scalar(String strScalar) {
        this.scalarValue = strToScalar(strScalar);
    }

    public double strToScalar(String strScalar) {
        return Double.parseDouble(strScalar);
    }
}
