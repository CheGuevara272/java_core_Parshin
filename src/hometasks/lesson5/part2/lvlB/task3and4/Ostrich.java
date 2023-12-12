package hometasks.lesson5.part2.lvlB.task3and4;

public class Ostrich extends NotFlying implements Run{
    @Override
    void voice() {
        System.out.println("Ostrich's voice");
    }

    @Override
    public void run() {
        System.out.println("Ostrich is running");
    }
}
