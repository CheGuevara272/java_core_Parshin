package hometasks.lesson10.lvlA.task1;

import java.util.ArrayList;

/*Создать список ArrayList который хранит в себе все цвета радуги. Вывести их в консоль.*/

public class Run {
    public static void main(String[] args) {
        ArrayList<String> rainbow = new ArrayList<>();
        rainbow.add("Red");
        rainbow.add("Orange");
        rainbow.add("Yellow");
        rainbow.add("Green");
        rainbow.add("Yellow");
        rainbow.add("Indigo");
        rainbow.add("Violet");
        System.out.println(rainbow);
    }
}
