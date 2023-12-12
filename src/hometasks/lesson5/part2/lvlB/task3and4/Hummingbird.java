package hometasks.lesson5.part2.lvlB.task3and4;

public class Hummingbird extends Flying implements Fly {
    @Override
    void voice() {
        System.out.println("Hummingbird's voice");
    }

    @Override
    public void fly() {
        System.out.println("Hummingbird is flying");
    }
}
