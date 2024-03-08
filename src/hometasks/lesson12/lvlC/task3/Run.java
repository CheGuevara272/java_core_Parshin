package hometasks.lesson12.lvlC.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Run {
    private static final String DIR = "../src/hometasks/lesson12/lvlC/task3";

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Jenya", (byte) 23));
        studentList.add(new Student("Slava", (byte) 28));
        studentList.add(new Student("Kseniya", (byte) 34));
        studentList.add(new Student("Natasha", (byte) 32));
        studentList.add(new Student("Oleg", (byte) 30));

        try {
            FileOutputStream fileOut = new FileOutputStream(new File(DIR, "student_list.json"));
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(studentList);
            out.close();
            fileOut.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            FileInputStream fileIn = new FileInputStream(new File(DIR, "student_list.json"));
            ObjectInputStream in = new ObjectInputStream(fileIn);
            System.out.println("Deserialized Data: \n" + in.readObject().toString());
            in.close();
            fileIn.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
