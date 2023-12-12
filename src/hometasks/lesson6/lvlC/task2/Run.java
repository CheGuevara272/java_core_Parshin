package hometasks.lesson6.lvlC.task2;

/*Отформатировать стихотворение с выравниванием по обоим краям. Для этого добавить дополнительные пробелы между словами,
  так чтобы ширина строк стала равной, а число пробелов между словами отличалось не более чем на единицу внутри каждой строки.
  Наращивание количества пробелов должно идти от первого слова. Написанный код должен быть универсальным для любого стихотворения.
  Создать класс Run и в методе main продемонстрировать работу кода.*/

/*Мне кажется, что это задание слишком сильно завязано на алгоритмике и почти не требует изучения новых классов и методов.
  Хотя может я не нашёл более простого способа сделать задание*/

/*Не самый оптимальный способ сделать это задание и его точно можно улучшить в некоторых маментах, но я уже устал над ним сидеть
  Потом возможно допилю))))*/

import hometasks.appendix.Versh;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Run {
    public static void main(String[] args) {
        Pattern linePattern = Pattern.compile("\\n");
        String[] lines = Versh.versh.split(linePattern.pattern());

        //Нахожу самое длинное предложение
        int maxLength = 0;
        for (int i = 0; i < lines.length; i++) {
            if (lines[i].length() > lines[maxLength].length()) {
                maxLength = i;
            }
        }

        //Метод добавляющий пробелы в строки
        expandLines(lines, lines[maxLength].length());

        for (int i = 0; i < lines.length; i++) {
            System.out.println(lines[i]);
        }
    }


    private static void expandLines(String[] lines, int length) {
        for (int i = 0; i < lines.length; i++) {
            if (lines[i].length() < length) {
                //Разделяю строку на массив слов
                String[] words = lines[i].split("\\s");
                int lengthWithoutSpaces = lines[i].replaceAll("\\s", "").length();

                //Метод который равномерно распределяет пробелы и возвращает массив из правильных пробелов
                List<String> spacesList = spacesArray(words, length, lengthWithoutSpaces);

                //Объединяю массивы слов и пробелов в строки и заношу на своё место в стихотворение
                lines[i] = concatWords(words, spacesList);
            }
        }
    }

    private static List<String> spacesArray(String[] words, int length, int lengthWithoutSpaces) {
        float spaceLength = (float) (length - lengthWithoutSpaces) / (words.length - 1);

        //Нахожу минимальную длинны пробела необходимую в этой строке и создаю массив из них
        List<String> spacesList = new ArrayList<>();
        String whiteSpace = " ";
        for (int i = 0; i < words.length - 1; i++) {
            spacesList.add(whiteSpace.repeat((int) spaceLength));
        }

        //Добавляю оставшиеся необходимые пробелы в массив, если надо
        if (spaceLength - (int) spaceLength != 0) {
            int remainingSpaces = (length - lengthWithoutSpaces) % (words.length - 1);
            for (int i = 0; i < remainingSpaces; i++) {
                spacesList.set(i, spacesList.get(i) + whiteSpace);
            }
        }

        return spacesList;
    }

    private static String concatWords(String[] words, List<String> space) {
        String line = "";
        int wordNumber = 0;
        int spaceNumber = 0;

        //Просто поочерёдно побавляю слова и пробелы в строку
        for (int i = 0; i < words.length * 2 - 1; i++) {
            if (i % 2 == 0) {
                line = line.concat(words[wordNumber]);
                wordNumber++;
            } else {
                line = line.concat(space.get(spaceNumber));
                spaceNumber++;
            }
        }
        return line;
    }
}
