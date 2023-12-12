package hometasks.lesson10.lvlA.task3;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    String facultyName;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    List<Group> faculty = new ArrayList<>();

    public void printFacultyName() {
        System.out.println("\t" + "Faculty name: " + facultyName);
        for (Group item : faculty) {
            item.printGroupId();
        }
    }
}
