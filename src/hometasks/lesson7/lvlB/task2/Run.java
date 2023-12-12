package hometasks.lesson7.lvlB.task2;

/*Создайте класс Circus в котором будет поле name и будут поля с типом Bear, Elephant, Horse.
  У каждого животного реализуйте метод iCan(), который выводит в консоль текст “я умею ходить”.
  В методе main  класса Run создайте два объекта типа Circus, задайте им имена и укажите,
  что умеют животные в этих цирках. */
public class Run {
    public static void main(String[] args) {
        Circus duSoleil = new Circus("du Soleil", "I can ride a bike", "I can dance", "I can fly");
        duSoleil.bear.iCan();
        duSoleil.elephant.iCan();
        duSoleil.horse.iCan();

        Circus shanghaiCircus = new Circus("Shanghai Circus World", "I can sing", "I can draw a painting", "I can do a backflip");
        shanghaiCircus.bear.iCan();
        shanghaiCircus.elephant.iCan();
        shanghaiCircus.horse.iCan();
    }
}
