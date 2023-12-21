package hometasks.lesson10.lvlB.task1;

public class Student {
    String name;
    double avgScore;

    public Student(String name, double avgScore) {
        this.name = name;
        this.avgScore = avgScore;
    }

    public void printStudentInfo() {
        System.out.println("\t\t\t" + "Student name: " + name + "; Average score: " + avgScore);
    }
}
