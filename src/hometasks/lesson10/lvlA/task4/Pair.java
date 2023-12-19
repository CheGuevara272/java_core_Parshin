package hometasks.lesson10.lvlA.task4;

public class Pair<L, R> {
    private L l;
    private R r;

    public Pair(L l, R r) {
        this.l = l;
        this.r = r;
    }

    public L getL() {
        return l;
    }

    public R getR() {
        return r;
    }

    public void setL(L l) {
        this.l = l;
    }

    public void setR(R r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return String.format("Student name: %s; avg score: %.2f", l, r);
    }
}
