package hometasks.lesson10_1.levelC.task1;

import java.util.Scanner;

/*В консоль вводится строка состоящая из числовых выражений и символов “(“, “)”,  “{”,  “}”,  “[”,  “]”.
  Проверьте и выведите в консоль результат корректности расстановки скобок.
  В классе Run создайте метод для проверки работы метода корректности ввода скобок
  и в методе main продемонстрируйте работу этого метода.*/

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числовое выражение: ");
        Validator validator = new Validator();
        System.out.println(validator.validateBrackets(scanner.nextLine()));
    }
}
