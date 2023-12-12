package hometasks.lesson10.lvlA.task4;

import java.util.Random;

public class Dean {
    public static void main(String[] args) {
        Group group = new Group();
        group.addStudent(new Pair<>("John", generateNumber()));
        group.addStudent(new Pair<>("Rick", generateNumber()));
        group.addStudent(new Pair<>("Luther", generateNumber()));
        group.addStudent(new Pair<>("Kenny", generateNumber()));
        group.addStudent(new Pair<>("Richy", generateNumber()));
        group.addStudent(new Pair<>("Stewie", generateNumber()));
        group.addStudent(new Pair<>("Peter", generateNumber()));
        group.addStudent(new Pair<>("Eugene", generateNumber()));
        group.addStudent(new Pair<>("Gwen", generateNumber()));
        group.addStudent(new Pair<>("Miles", generateNumber()));
        group.addStudent(new Pair<>("Ahsoka", generateNumber()));
        group.addStudent(new Pair<>("Luke", generateNumber()));
        group.addStudent(new Pair<>("Anakin", generateNumber()));
        group.addStudent(new Pair<>("Aerith", generateNumber()));
        group.addStudent(new Pair<>("Eris", generateNumber()));
        group.addStudent(new Pair<>("Cloud", generateNumber()));
        group.addStudent(new Pair<>("Tifa", generateNumber()));
        group.addStudent(new Pair<>("Rogue", generateNumber()));
        group.addStudent(new Pair<>("Geralt", generateNumber()));
        group.addStudent(new Pair<>("Triss", generateNumber()));

        group.printGroup();
    }

    public static Double generateNumber() {
        Random random = new Random(423);
        return random.nextDouble(6.01) + 4;
    }
}
