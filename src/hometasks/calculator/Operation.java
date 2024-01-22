package hometasks.calculator;

public interface Operation<T extends Var> {
    void sum(T t);

    void subt(T t);

    void mult(T t);

    void div(T t);
}
