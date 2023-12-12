package hometasks.lesson5.part2.lvlB.task1;

public class Run {
    public static void main(String[] args) {
        Ford fiesta = new Ford(6, 4, 5, 8, 7);
        Mercedes GLE = new Mercedes(8, 8, 9, 8, 10);
        Mitsubishi outlander = new Mitsubishi(8, 7, 8, 10, 9);

        fiesta.move();
        GLE.move();
        outlander.move();
    }
}
