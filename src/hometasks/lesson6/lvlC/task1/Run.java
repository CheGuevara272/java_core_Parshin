package hometasks.lesson6.lvlC.task1;

import hometasks.appendix.Versh;

import java.util.regex.Pattern;

/*Вывести в консоль в столбик все предложения из стихотворения в порядке возрастания количества символов.
  Создать класс Run и в методе main продемонстрировать работу кода.*/
public class Run {
    public static void main(String[] args) {
        Pattern sentencePattern = Pattern.compile("\\.\\n\\s\\n|\\.\\n");
        // А это регулярное выражения для сортировки по длине строк, а не предложений "\.\n\s\n|,\n|\n|\.\n"
        String[] sentences = Versh.versh.split(sentencePattern.pattern());

        quickSort(sentences, 0, sentences.length - 1);

        for (int i = 0; i < sentences.length; i++) {
            System.out.println((i + 1) + ") " + sentences[i]);
        }
    }

    private static void quickSort(String[] sentences, int low, int high) {
        if (sentences.length == 0 || low >= high) return;

        int middle = low + (high - low) / 2;
        String border = sentences[middle];

        int i = low, j = high;
        while (i <= j) {
            while (sentences[i].length() < border.length()) i++;
            while (sentences[j].length() > border.length()) j--;
            if (i <= j) {
                String swap = sentences[i];
                sentences[i] = sentences[j];
                sentences[j] = swap;
                i++;
                j--;
            }
        }

        if (low < j) quickSort(sentences, low, j);
        if (high > i) quickSort(sentences, i, high);
    }
}
