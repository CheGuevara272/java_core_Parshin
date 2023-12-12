package hometasks.lesson5.part2.lvlB.task2;

public class Student {
    private String firstName;
    private String secondName;
    private int age;
    private String group;
    private double averageScore;

    public Student(String firstName, String secondName, int age, String group, double averageScore) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.group = group;
        this.averageScore = averageScore;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public void printStudentInfo() {
        System.out.println("Students name: " + secondName + " " + firstName +
                '\n' + "Age: " + age +
                '\n' + "Group: " + group +
                '\n' + "Average score: " + averageScore);
    }
}
