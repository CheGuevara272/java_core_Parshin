package hometasks.lesson10_1.levelA.task2;

import java.util.Map;
import java.util.TreeMap;

/*Создайте класс Run и в методе main создайте TreeMap группы с набранными количествами баллов.
  Вывести в консоль список группы в  формате: Фамилия: сумма баллов.*/

public class Run {
    public static void main(String[] args) {
        Map<String, Float> group = new TreeMap<>();
        group.put("Gwen", 9.81f);
        group.put("Topson", 7.69f);
        group.put("Nikita", 8.23f);
        group.put("Hiness", 7.56f);
        group.put("Slava", 8.40f);

        for (Map.Entry<String, Float> entry : group.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
