package hometasks.lesson5.part2.lvlB.task3and4;

public class Macaw extends Flying implements Fly {
    @Override
    void voice() {
        System.out.println("Macaw's voice");
    }

    @Override
    public void fly() {
        System.out.println("Macaw is flying");
    }
}
