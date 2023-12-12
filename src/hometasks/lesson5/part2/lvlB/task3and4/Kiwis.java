package hometasks.lesson5.part2.lvlB.task3and4;

public class Kiwis extends NotFlying implements Run {
    @Override
    void voice() {
        System.out.println("Kiwis' voice");
    }

    @Override
    public void run() {
        System.out.println("Kiwis is running");
    }
}
