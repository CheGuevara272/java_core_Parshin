package hometasks.calculator;

public interface Operation<T extends Var> {
    T sum(T t) throws CustomException;

    T subt(T t) throws CustomException;

    T mult(T t) throws CustomException;

    T div(T t) throws CustomException;
}
