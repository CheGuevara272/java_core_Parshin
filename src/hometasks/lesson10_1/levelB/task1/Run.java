package hometasks.lesson10_1.levelB.task1;

import hometasks.appendix.Versh;

import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class Run {
    public static void main(String[] args) {

        Pattern wordPattern = Pattern.compile("\\.\\n\\s\\n|,\\s|\\s|\\n|\\.\\n");
        String text = Versh.versh.toLowerCase();
        String[] words = text.split(wordPattern.pattern());

        printMap(countWords(words));
    }

    private static Map<String, Integer> countWords(String[] words) {
        Map<String, Integer> wordsList = new TreeMap<>();
        for (int i = 0; i < words.length; i++) {
            if (wordsList.containsKey(words[i])) {
                wordsList.computeIfPresent(words[i], (k, v) -> v + 1);
            } else {
                wordsList.put(words[i], 1);
            }
        }
        return wordsList;
    }

    private static void printMap(Map<String, Integer> wordsList) {
        for (Map.Entry<String, Integer> entry : wordsList.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
