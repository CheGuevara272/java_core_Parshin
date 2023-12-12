package hometasks.lesson5.part2.lvlB.task3and4;

public class Penguin extends NotFlying implements Slide{
    @Override
    void voice() {
        System.out.println("Penguin's voice");
    }

    @Override
    public void slide() {
        System.out.println("Penguin is sliding");
    }
}
