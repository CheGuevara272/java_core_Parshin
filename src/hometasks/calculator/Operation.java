package hometasks.calculator;

public interface Operation<T> {
    T sum(T t1, T t2);

    T subt(T t1, T t2);

    T mult(T t1, T t2);

    T div(T t1, T t2);


}
