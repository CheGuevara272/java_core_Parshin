package hometasks.calculator;

public class Scalar extends Var {
    public Double scalarValue;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Scalar{");
        sb.append("scalarValue=").append(scalarValue);
        sb.append('}');
        return sb.toString();
    }

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
    public Scalar sum(Var other) {
        Scalar result = new Scalar(this.scalarValue);
        if (other instanceof Scalar) {
            result.scalarValue = this.scalarValue + ((Scalar) other).scalarValue;
        } else {

        }
        return result;
    }

    @Override
    public Scalar subt(Var other) {
        Scalar result = new Scalar(this.scalarValue);
        if (other instanceof Scalar) {
            result.scalarValue = this.scalarValue - ((Scalar) other).scalarValue;
        } else {

        }
        return result;
    }

    @Override
    public Scalar mult(Var other) {
        Scalar result = new Scalar(this.scalarValue);
        if (other instanceof Scalar) {
            result.scalarValue = this.scalarValue * ((Scalar) other).scalarValue;
        } else {

        }
        return result;
    }

    @Override
    public Scalar div(Var other) {
        Scalar result = new Scalar(this.scalarValue);
        if (other instanceof Scalar) {
            result.scalarValue = this.scalarValue / ((Scalar) other).scalarValue;
        } else {

        }
        return result;
    }
}
