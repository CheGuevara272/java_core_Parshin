package hometasks.lesson10_1.levelC.task1;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числовое выражение: ");
        Validator validator = new Validator();
        System.out.println(validator.validateBrackets(scanner.nextLine()));
    }
}
