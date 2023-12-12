package hometasks.lesson7.lvlA.task1;

/*Создайте класс University, который содержит поле с типом Student.
  Внутренний класс Student должен хранить информацию о студенте.
  Создайте класс Run и в методе main выведите в консоль информацию о студенте.*/

public class Run {
    public static void main(String[] args) {
        University BSU = new University();

        BSU.Ivanov.printInfo();
    }
}
