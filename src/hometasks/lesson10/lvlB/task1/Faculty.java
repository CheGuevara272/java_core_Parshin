package hometasks.lesson10.lvlB.task1;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    String facultyName;
    List<Group> faculty = new ArrayList<>();

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    public void addGroup(Group group) {
        this.faculty.add(group);
    }


    public void printFacultyName() {
        System.out.println("\t" + "Faculty name: " + facultyName);
        for (Group item : faculty) {
            item.printGroupId();
        }
    }
}
