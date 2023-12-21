package hometasks.lesson10.lvlA.task3;

import java.util.Random;

/*Создать класс Dean, в котором в методе main декан будет проверять успеваемость группы студентов своего факультета.
Для этого создайте объект Group и заполните его поля, должно быть минимум 20 человек в группе.
Средний балл студенту нужно задать в диапазоне от 4 до 10 с помощью генератора случайных чисел.
Далее декану нужно сформировать список тех, у кого средний балл 6 и выше, чтобы он знал кому давать стипендию.
Для этого с помощью итератора нужно перебрать список группы и удалить из списка всех у кого балл ниже 6.
вывести на консоль список всей группы (с оценками) и на следующей строке имена тех, кому дадут стипендию. */

public class Dean {

    static Random random = new Random();
    public static void main(String[] args) {
        Group group = new Group();
        fillGroup(group);
//        group.addStudent(new Pair<>("John", generateNumber()));
//        group.addStudent(new Pair<>("Rick", generateNumber()));
//        group.addStudent(new Pair<>("Luther", generateNumber()));
//        group.addStudent(new Pair<>("Kenny", generateNumber()));
//        group.addStudent(new Pair<>("Richy", generateNumber()));
//        group.addStudent(new Pair<>("Stewie", generateNumber()));
//        group.addStudent(new Pair<>("Peter", generateNumber()));
//        group.addStudent(new Pair<>("Eugene", generateNumber()));
//        group.addStudent(new Pair<>("Gwen", generateNumber()));
//        group.addStudent(new Pair<>("Miles", generateNumber()));
//        group.addStudent(new Pair<>("Ahsoka", generateNumber()));
//        group.addStudent(new Pair<>("Luke", generateNumber()));
//        group.addStudent(new Pair<>("Anakin", generateNumber()));
//        group.addStudent(new Pair<>("Aerith", generateNumber()));
//        group.addStudent(new Pair<>("Eris", generateNumber()));
//        group.addStudent(new Pair<>("Cloud", generateNumber()));
//        group.addStudent(new Pair<>("Tifa", generateNumber()));
//        group.addStudent(new Pair<>("Rogue", generateNumber()));
//        group.addStudent(new Pair<>("Geralt", generateNumber()));
//        group.addStudent(new Pair<>("Triss", generateNumber()));

        group.printGroup();
    }

    public static Double generateNumber() {
        return random.nextDouble(6.01) + 4;
    }

    public static Pair generateStudent() {
        return new Pair<>(String.valueOf(random.nextInt()), random.nextDouble(6.01) + 4);
    }

    public static void fillGroup(Group group) {
        for (int i = 0; i < 20; i++) {
            group.addStudent(generateStudent());
        }
    }
}
