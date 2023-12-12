package hometasks.lesson6.lvlB.task5;

import hometasks.appendix.Versh;

import java.util.ArrayList;
import java.util.regex.Pattern;

/*Написать программу, которая находит все слова стихотворения (из приложения) начинающихся на гласную.
  Вывести все эти слова в консоль. Создать класс Run и в методе main проверить работу этой программы.*/
public class Run {
    public static void main(String[] args) {
        Pattern wordPattern = Pattern.compile("\\n\\s\\n|,\\s|\\s|\\n");
        String vowels = "aeiouyауоиэыяюеёі";
        ArrayList<Character> vowelList = new ArrayList();
        for (int i = 0; i < vowels.length(); i++) {
            vowelList.add(vowels.charAt(i));
        }

        String[] words = Versh.versh.split(wordPattern.pattern());
        for (int i = 0; i < words.length; i++) {
            if (vowelList.contains(words[i].charAt(0))) {
                System.out.println(words[i]);
            }
        }
    }
}
