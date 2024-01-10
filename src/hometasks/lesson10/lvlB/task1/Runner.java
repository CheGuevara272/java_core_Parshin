package hometasks.lesson10.lvlB.task1;

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
        University bsu = new University("bsu");
        fillUniversity(bsu);

        bsu.printUniversityName();
    }

    public static Student generateStudent() {
        return new Student(String.valueOf(random.nextInt()), random.nextDouble());
    }

    public static Group generateGroup() {
        Group group = new Group(random.nextInt());
        fillGroup(group);
        return group;
    }

    public static Faculty generateFaculty() {
        Faculty faculty = new Faculty(String.valueOf(random.nextInt()));
        fillFaculty(faculty);
        return faculty;
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
