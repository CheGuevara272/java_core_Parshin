package hometasks.lesson10.lvlB.task1;

import java.util.ArrayList;
import java.util.List;

public class Group {
    int groupNumber;
    List<Student> group = new ArrayList<>();

    public Group(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public void addStudent(Student student) {
        this.group.add(student);
    }

    public void printGroupId() {
        System.out.println("\t\t" + "Group number: " + groupNumber);
        for (Student item : group) {
            item.printStudentInfo();
        }
    }
}
