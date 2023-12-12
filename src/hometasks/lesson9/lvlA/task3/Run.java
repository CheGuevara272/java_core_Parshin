package hometasks.lesson9.lvlA.task3;

public class Run {
    public static void main(String[] args) {
        NumberArray numberArray = new NumberArray();

        numberArray.setElement(0, 2.45E301);
        numberArray.setElement(1, -4.31E21f);
        numberArray.setElement(2, (byte) 24);
        numberArray.setElement(3, 1_234_534_523);
        numberArray.setElement(4, 34_534_532_435_634L);

        numberArray.printArray();
    }
}
