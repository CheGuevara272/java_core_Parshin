package hometasks.lesson10.lvlB.task1;

import java.util.ArrayList;
import java.util.List;

public class University {
    String universityName;

    List<Faculty> university = new ArrayList<>();

    public University(String universityName) {
        this.universityName = universityName;
    }

    public void addFaculty(Faculty faculty) {
        university.add(faculty);
    }

    public void printUniversityName() {
        System.out.println("University name: " + universityName);
        for (Faculty item : university) {
            item.printFacultyName();
        }
    }
}
