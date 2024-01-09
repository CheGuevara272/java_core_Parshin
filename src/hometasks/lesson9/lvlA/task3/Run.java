package hometasks.lesson9.lvlA.task3;

/*Создать класс NumberArray, который может хранить в себе массив только из 5 числовых типов.
  Реализовать методы setElement и getElement которые будут сохранять и получать элементы по заданному индексу.
  Реализовать метод printArray, который будет выводить в консоль все данные хранящиеся в этом классе.
  Создать класс Run и в методе main создать объект класса NumberArray сохранив в него 5 чисел, выведите эти числа в консоль.*/

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
