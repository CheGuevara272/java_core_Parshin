package hometasks.lesson10.lvlC.task2;

import java.util.ArrayList;
import java.util.Scanner;

/*В кругу стоят n человек. При ведении счёта по кругу итератором вычёркивается каждый второй человек,
  пока не останется один. Напишите метод, который на вход принимает список людей n человек,
  а на выходе выводит имя оставшегося человека. Показать пример работы метода в классе Runner.*/

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
