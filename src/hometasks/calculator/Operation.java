package hometasks.calculator;

public interface Operation<T extends Var> {
    T sum(T t);

    T subt(T t);

    T mult(T t);

    T div(T t);
}
