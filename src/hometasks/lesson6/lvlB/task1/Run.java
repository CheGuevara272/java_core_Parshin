package hometasks.lesson6.lvlB.task1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern wordPattern = Pattern.compile("^[a-zA-Zа-яА-Я]+$");

        System.out.print("Write down your word without white spaces: ");
        StringBuilder word = new StringBuilder(scanner.nextLine());
        Matcher matchesWord = wordPattern.matcher(word);
        if (!word.isEmpty() && matchesWord.matches()) {
            StringBuilder reversedWord = new StringBuilder(word.reverse());
            if (word.compareTo(reversedWord) == 0) {
                System.out.println("Word is palindrome");
            } else {
                System.out.println("Word is not palindrome");
            }
        } else {
            System.out.println("Input is incorrect");
        }
    }
}
