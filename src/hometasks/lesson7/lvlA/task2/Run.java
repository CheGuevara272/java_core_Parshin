package hometasks.lesson7.lvlA.task2;

public class Run {
    public static void main(String[] args) {
        Parrot jack = new Parrot();
        jack.say();

        Parrot parrot = new Parrot() {
            @Override
            public void say() {
                System.out.println("No, they can!");
            }
        };
        parrot.say();
    }
}
