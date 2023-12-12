package hometasks.lesson10.lvlA.task3;

import java.util.ArrayList;
import java.util.List;

public class University {
    String universityName;

    List<Faculty> university = new ArrayList<>();

    public void printUniversityName() {
        System.out.println("University name: " + universityName);
        for (Faculty item : university) {
            item.printFacultyName();
        }
    }
}
