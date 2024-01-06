package hometasks.lesson10.lvlC.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n:");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            ints.add(i + 1);
        }

        Remover<Integer> remover = new Remover<>();
        System.out.println(remover.remover(ints));
    }
}
