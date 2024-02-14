package hometasks.lesson12.lvlC.task3;

import java.io.Serializable;
import java.util.StringJoiner;

public class Student implements Serializable {
    String name;
    byte age;

    public Student(String name, byte age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("age=" + age)
                .toString();
    }
}
