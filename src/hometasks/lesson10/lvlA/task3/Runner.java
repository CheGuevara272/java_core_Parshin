package hometasks.lesson10.lvlA.task3;

/*Создать класс Student который будет хранить в себе имя и средний балл студента.
Создать класс Group который будет хранить в себе номер группы и список одногруппников.
Создайте класс Faculty который будет хранить в себе название факультета и список групп этого факультета.
Создайте класс University который будет хранить в себе название университета и список факультетов.
Создайте класс Runner, в методе main создайте один объект класса University
и заполните все его поля данными (во всех списках должно хранится минимум 3 объекта).
Выведите в консоль средний балл студентов по университету.*/

/*Как же сложно было написать вес этот репетативный код.
Мне кажется такого лучше делать поменьше в рамках учебных заданий*/

import java.util.Random;

public class Runner {
    static Random random = new Random();
    public static void main(String[] args) {
        University BSU = new University("BSU");
        fillUniversity(BSU);
        for (Faculty faculty : BSU.university) {
            fillFaculty(faculty);
            for (Group group : faculty.faculty) {
                fillGroup(group);
            }
        }

// Весь вот этот код сократился до 6 методов и пары вложенных циклов в main, которые легко масштабировать
//        Faculty chemistry = new Faculty("chemistry");
//        BSU.university.add(chemistry);
//        Group a = new Group(1);
//        chemistry.faculty.add(a);
//        Student student1 = new Student("1", 4.53);
//        a.group.add(student1);
//        Student student2 = new Student("2", 5);
//        a.group.add(student2);
//        Student student3 = new Student("3", 3.67);
//        a.group.add(student3);
//        Group b = new Group(2);
//        chemistry.faculty.add(b);
//        Student student4 = new Student("4", 3);
//        b.group.add(student4);
//        Student student5 = new Student("5", 5);
//        b.group.add(student5);
//        Student student6 = new Student("6", 4.23);
//        b.group.add(student6);
//        Group c = new Group(3);
//        chemistry.faculty.add(c);
//        Student student7 = new Student("7", 5);
//        c.group.add(student7);
//        Student student8 = new Student("8", 4);
//        c.group.add(student8);
//        Student student9 = new Student("9", 3);
//        c.group.add(student9);
//
//        Faculty physics = new Faculty("physics");
//        BSU.university.add(physics);
//        Group d = new Group(4);
//        physics.faculty.add(d);
//        Student student10 = new Student("10", 3.1);
//        d.group.add(student10);
//        Student student11 = new Student("11", 2.1);
//        d.group.add(student11);
//        Student student12 = new Student("12", 4.4);
//        d.group.add(student12);
//        Group e = new Group(5);
//        physics.faculty.add(e);
//        Student student13 = new Student("13", 6.4);
//        e.group.add(student13);
//        Student student14 = new Student("14", 7.45);
//        e.group.add(student14);
//        Student student15 = new Student("15", 5.7);
//        e.group.add(student15);
//        Group f = new Group(6);
//        physics.faculty.add(f);
//        Student student16 = new Student("16", 3.4);
//        f.group.add(student16);
//        Student student17 = new Student("17", 6.4);
//        f.group.add(student17);
//        Student student18 = new Student("18", 1.5);
//        f.group.add(student18);
//
//        Faculty mathematics = new Faculty("mathematics");
//        BSU.university.add(mathematics);
//        Group g = new Group(7);
//        mathematics.faculty.add(g);
//        Student student19 = new Student("19", 6.1);
//        g.group.add(student19);
//        Student student20 = new Student("20", 4.6);
//        g.group.add(student20);
//        Student student21 = new Student("21", 7.3);
//        g.group.add(student21);
//        Group h = new Group(8);
//        mathematics.faculty.add(h);
//        Student student22 = new Student("22", 3.5);
//        h.group.add(student22);
//        Student student23 = new Student("23", 6.3);
//        h.group.add(student23);
//        Student student24 = new Student("24", 1.2);
//        h.group.add(student24);
//        Group i = new Group(9);
//        mathematics.faculty.add(i);
//        Student student25 = new Student("25", 2.1);
//        i.group.add(student25);
//        Student student26 = new Student("26", 3.2);
//        i.group.add(student26);
//        Student student27 = new Student("27", 5.2);
//        i.group.add(student27);

        BSU.printUniversityName();
    }

    public static Student generateStudent() {
        return new Student(String.valueOf(random.nextInt()), random.nextDouble());
    }

    public static Group generateGroup() {
        return new Group(random.nextInt());
    }

    public static Faculty generateFaculty() {
        return new Faculty(String.valueOf(random.nextInt()));
    }

    public static void fillGroup(Group group) {
        for (int i = 0; i < 3; i++) {
            group.addStudent(generateStudent());
        }
    }

    public static void fillFaculty(Faculty faculty) {
        for (int i = 0; i < 3; i++) {
            faculty.addGroup(generateGroup());
        }
    }

    public static void fillUniversity(University university) {
        for (int i = 0; i < 3; i++) {
            university.addFaculty(generateFaculty());
        }
    }
}
