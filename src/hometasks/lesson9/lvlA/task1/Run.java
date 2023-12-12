package hometasks.lesson9.lvlA.task1;

public class Run {
    public static void main(String[] args) {
        Container containerOne = new Container();
        Container containerTwo = new Container();
        containerOne.setContent("content");
        containerTwo.setContent("another content");

        System.out.println(containerOne.getContent());
        System.out.println(containerTwo.getContent());
    }
}
