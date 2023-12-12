package hometasks.lesson7.lvlA.task1;

public class University {
    Student Ivanov = new Student("Ivanov", 23);

    class Student {
        String name;
        int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void printInfo() {
            System.out.println("Name: " + this.name + '\n' + "Age: " + this.age);
        }
    }


}
