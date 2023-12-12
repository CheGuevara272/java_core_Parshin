package hometasks.lesson6.lvlA.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Run {
    final static String testStr1 = "{{23, 54, 4, 34}, {2323423423424, 233, 12, 1}, {7, 7, 0, 0}}";
    final static String testStr2 = "5313";
    final static String testStr3 = "{25, 2}";

    public static void main(String[] args) {
        Pattern scalar = Pattern.compile("(?<!(\\{|,\\s|\\d))(\\d+)(?!(\\d|,\\s|\\}))");
        Pattern vector = Pattern.compile("(?<!(\\{|,\\s))(\\{(\\d+,\\s)\\d\\})(?!(,\\s|\\}))");
        Pattern matrix = Pattern.compile("\\{((\\{(\\d+,\\s)+\\d+\\}),\\s)+(\\{(\\d+,\\s)+\\d+\\})\\}");

        //testStr1 = "{{23, 54, 4, 34}, {2323423423424, 233, 12, 1}, {7, 7, 0, 0}}"
        Matcher matchScalar = scalar.matcher(testStr1);
        System.out.println("Test string 1 matches scalar: " + matchScalar.matches());
        Matcher matchVector = vector.matcher(testStr1);
        System.out.println("Test string 1 matches vector: " + matchVector.matches());
        Matcher matchMatrix = matrix.matcher(testStr1);
        System.out.println("Test string 1 matches matrix: " + matchMatrix.matches());

        //testStr2 = "5313"
        matchScalar = scalar.matcher(testStr2);
        System.out.println("Test string 2 matches scalar: " + matchScalar.matches());
        matchVector = vector.matcher(testStr2);
        System.out.println("Test string 2 matches vector: " + matchVector.matches());
        matchMatrix = matrix.matcher(testStr2);
        System.out.println("Test string 2 matches matrix: " + matchMatrix.matches());

        //testStr3 = "{25, 2}"
        matchScalar = scalar.matcher(testStr3);
        System.out.println("Test string 3 matches scalar: " + matchScalar.matches());
        matchVector = vector.matcher(testStr3);
        System.out.println("Test string 3 matches vector: " + matchVector.matches());
        matchMatrix = matrix.matcher(testStr3);
        System.out.println("Test string 3 matches matrix: " + matchMatrix.matches());
    }
}
