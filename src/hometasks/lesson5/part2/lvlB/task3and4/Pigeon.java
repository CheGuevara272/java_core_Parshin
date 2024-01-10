package hometasks.lesson5.part2.lvlB.task3and4;

public class Pigeon extends Flying implements Fly {
    @Override
    void voice() {
        System.out.println("Pigeon's voice");
    }

    @Override
    public void fly() {
        System.out.println("Pigeon is flying");
    }
}
