package hometasks.calculator;

public class Scalar extends Var implements Operation<Double> {
    private Double scalarValue;

    public Scalar(Double value) {
        this.scalarValue = value;
    }

    public Scalar(Scalar scalar) {
        this.scalarValue = scalar.scalarValue;
    }

    public Scalar(String strScalar) {
        this.scalarValue = strToScalar(strScalar);
    }

    public Double strToScalar(String strScalar) {
        return Double.parseDouble(strScalar);
    }

    @Override
    public Double sum(Double t1, Double t2) {
        return t1 + t2;
    }

    @Override
    public Double subt(Double t1, Double t2) {
        return t1 - t2;
    }

    @Override
    public Double mult(Double t1, Double t2) {
        return t1 * t2;
    }

    @Override
    public Double div(Double t1, Double t2) {
        return t1 / t2;
    }
}
