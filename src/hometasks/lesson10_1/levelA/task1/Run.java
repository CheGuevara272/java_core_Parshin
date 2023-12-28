package hometasks.lesson10_1.levelA.task1;

import java.util.HashMap;
import java.util.Map;

public class Run {
    public static void main(String[] args) {
        Map<String, String> employees = new HashMap<>();
        employees.put("375291113355", "Якуб Колас");
        employees.put("375336664455", "Янка Купала");
        employees.put("375333451177", "Васіль Быкаў");
        employees.put("375257773345", "Рыгор Барадулін");
        employees.put("375297774488", "Янка Маўр");
        employees.put("375447998811", "Святлана Алексіевіч");

        for (Map.Entry<String, String> entry : employees.entrySet()) {
            System.out.println(entry.getValue() + ": " + entry.getKey());
        }
    }
}
