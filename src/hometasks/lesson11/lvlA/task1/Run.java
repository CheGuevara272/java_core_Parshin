package hometasks.lesson11.lvlA.task1;

import java.util.Random;

public class Run {
    public static void main(String[] args) {
        Random random = new Random();
        int mark = random.nextInt(6);
        try {
            checkMark(mark);
        } catch (StudentException exception) {
            System.err.println(exception.getMessage());
        } finally {
            System.out.println("Спасибо за участие, ваша оценка: " + mark);
        }
    }

    public static void checkMark(int mark) throws StudentException {
        if (mark < 4) {
            throw new StudentException("Студент не сдал экзамен");
        }
    }
}
