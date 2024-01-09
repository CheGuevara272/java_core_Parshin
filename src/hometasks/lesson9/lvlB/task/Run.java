package hometasks.lesson9.lvlB.task;

/*Создать обобщённый класс Array, который хранит в себе массив объектов в количестве 10 шт по умолчанию.
  Реализовать метод setElement, который будет сохранять в первую свободную ячейку элемент.
  Реализовать метод getElement, который будет выводить элемент по заданному индексу.
  Реализовать метод contains, который будет проверять содержится ли уже такой элемент в массиве.
  Реализовать метод getIndex, который на входе будет принимать элемент, а на выходе индекс этого элемента в массиве.
  Создать класс Run и в методе main проверить работу каждого метода.

  Дополнить первое задание созданием метода printArray, который будет выводить в консоль все элементы,
  которые хранятся в массиве. Проверить работу этого метода.

  Дополнить первое задание созданием функционала, который будет расширять вместимость массива в 2 раза,
  если при добавлении нового элемента в массив все ячейки уже заняты. Проверить работу этого метода.

  Дополнить первое задание созданием метода delete, который будет принимать на вход либо объект,
  либо индекс элемента, который необходимо удалить. При этом, если удаляется элемент из середины,
  то все последующие объекты нужно сместить влево. Проверить работу этого метода, вывести в консоль
  значения индексов и элементов до удаления и после.*/

public class Run {
    public static void main(String[] args) {
        Array array = new Array();

        array.setElement(2324.25f);
        array.setElement((byte) 131);
        array.setElement(23L);
        array.setElement(23);

        System.out.println(array.contains((byte) 131));
        System.out.println(array.getIndex(13));
        System.out.println(array.getIndex(23));

        array.setElement(5);
        array.setElement(6);
        array.setElement(7);
        array.setElement(8);
        array.setElement(9);
        array.setElement(10);
        array.printArray();

        array.setElement(11);
        array.printArray();

        array.deleteElement(2);
        array.printArray();

        array.deleteElement((Integer) 8);
        array.printArray();

    }
}
