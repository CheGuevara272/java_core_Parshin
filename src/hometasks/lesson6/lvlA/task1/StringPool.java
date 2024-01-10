package hometasks.lesson6.lvlA.task1;

// 1.Сколько строк будет храниться в String Pool в результате выполнения следующего кода:
public class StringPool {
    public static void main(String[] args) {
        String s1 = "Cat1";
        String s2 = "Cat";
        String s3 = new String("Cat");
        String s4 = s3.intern();
        System.out.println("s1 == s2 :" + (s1 == s2));
        System.out.println("s1 == s3 :" + (s1 == s3));
        System.out.println("s1 == s4 :" + (s1 == s4));
    }
}

// Ответ: Будет храниться две строки - "Cat1" и "Cat"
