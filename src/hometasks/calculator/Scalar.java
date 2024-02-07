package hometasks.calculator;

public class Scalar extends Var {
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
    public Scalar sum(Var other) {
        Scalar result = new Scalar(this.scalarValue);
        if (other instanceof Scalar scalar) {
            result.scalarValue = this.scalarValue + scalar.scalarValue;
        }
        return result;
    }

    @Override
    public Scalar subt(Var other) {
        Scalar result = new Scalar(this.scalarValue);
        if (other instanceof Scalar scalar) {
            result.scalarValue = this.scalarValue - scalar.scalarValue;
        }
        return result;
    }

    @Override
    public Scalar mult(Var other) {
        Scalar result = new Scalar(this.scalarValue);
        if (other instanceof Scalar scalar) {
            result.scalarValue = this.scalarValue * scalar.scalarValue;
        }
        return result;
    }

    @Override
    public Scalar div(Var other) throws CustomException {
        Scalar result = new Scalar(this.scalarValue);
        if (other instanceof Scalar scalar) {
            if (scalar.scalarValue == 0) throw new CustomException("You can not divide by 0");
            result.scalarValue = this.scalarValue / scalar.scalarValue;
        }
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Scalar{");
        sb.append("scalarValue=").append(scalarValue);
        sb.append('}');
        return sb.toString();
    }
}
