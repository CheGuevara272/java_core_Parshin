package hometasks.lesson6.lvlC.task3;

import hometasks.appendix.Versh;

import java.util.Random;
import java.util.regex.Pattern;

public class Run {
    public static void main(String[] args) {
        Pattern wordPattern = Pattern.compile("\\n\\s\\n|,\\s|\\s|\\n");
        String[] words = Versh.versh.split(wordPattern.pattern());

        String randomText1 = slow(words);
        String randomText2 = fast(words);
        System.out.println("Both strings are similar: " + randomText1.equals(randomText2));
    }

    private static String slow(String[] words) {
        Random random = new Random(123);
        String randomText = "";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            randomText = randomText.concat(words[random.nextInt(words.length)] + " ");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Slow method time: " + (endTime - startTime));
        return randomText;
    }

    private static String fast(String[] words) {
        Random random = new Random(123);
        StringBuilder randomText = new StringBuilder();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            randomText.append(words[random.nextInt(words.length)]).append(" ");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Fast method time: " + (endTime - startTime));
        return randomText.toString();
    }
}
