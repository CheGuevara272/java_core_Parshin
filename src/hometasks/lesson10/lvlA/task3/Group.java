package hometasks.lesson10.lvlA.task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Group {
    private List<Pair<String, Double>> studentList = new ArrayList<>();

    public void printGroup() {
        Iterator groupIterator = studentList.listIterator();
        while (groupIterator.hasNext()) {
            System.out.println(groupIterator.next());
        }
    }

    public void addStudent(Pair<String, Double> student) {
        studentList.add(student);
    }
}
