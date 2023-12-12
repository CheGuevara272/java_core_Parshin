package hometasks.lesson9.lvlB.task;

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
