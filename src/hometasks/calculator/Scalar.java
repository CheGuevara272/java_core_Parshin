package hometasks.calculator;

public class Scalar extends Var implements Operation<Var> {
    public Double scalarValue;

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
    public void sum(Var var) {
        if (var instanceof Scalar) {
            this.scalarValue += ((Scalar) var).scalarValue;
        } else {

        }
    }

    @Override
    public void subt(Var var) {
        if (var instanceof Scalar) {
            this.scalarValue += ((Scalar) var).scalarValue;
        } else {

        }
    }

    @Override
    public void mult(Var var) {
        if (var instanceof Scalar) {
            this.scalarValue += ((Scalar) var).scalarValue;
        } else {

        }
    }

    @Override
    public void div(Var var) {
        if (var instanceof Scalar) {
            this.scalarValue += ((Scalar) var).scalarValue;
        } else {

        }
    }
}
