package hometasks.calculator;

import java.util.Map;
import java.util.TreeMap;

public class Saver {
    TreeMap<Character, String> operands = new TreeMap<>();

    public boolean save(String line) {
        if (operands.containsKey(line.charAt(0)))
            return false;
        operands.put(line.charAt(0), line.substring(line.indexOf('=') + 1));
        return true;
    }

    public void printVar() {
        for (Map.Entry<Character, String> entry : operands.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
