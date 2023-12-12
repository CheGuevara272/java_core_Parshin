package hometasks.lesson6.lvlB.task4;

import java.util.Scanner;

/*Напишите программу для определения оператора РБ по номеру телефона.
  Создать класс Run и в методе main проверить работу этой программы*/

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write down telephone number: ");
        String number = scanner.nextLine();
        if (number.strip().matches("^(\\+375|80)(17|25|29|33|44)(\\d{7})$")) {
            System.out.println(whatOperator(number));
        } else {
            System.out.println("Wrong number");
        }
    }

    private static String whatOperator(String number) {
        String operatorCode = number.substring(number.length() - 9, number.length() - 7);
        switch (operatorCode) {
            case "17":
                return "Beltelecom";
            case "25":
                return "Life:)";
            case "29":
                return MTCorA1(number);
            case "33":
                return "MTC";
            case "44":
                return "A1";
            default:
                return "Wrong number";
        }
    }

    private static String MTCorA1(String number) {
        char firstDigit = number.charAt(number.length() - 7);
        if (firstDigit == '1' || firstDigit == '3' || firstDigit == '6' || firstDigit == '9') {
            return "A1";
        } else if (firstDigit == '2' || firstDigit == '5' || firstDigit == '7' || firstDigit == '8') {
            return "MTC";
        } else {
            return "Wrong number";
        }
    }
}
