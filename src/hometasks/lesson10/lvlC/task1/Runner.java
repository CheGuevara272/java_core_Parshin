package hometasks.lesson10.lvlC.task1;

public class Runner {
    public static void main(String[] args) {
        MyHashSet<Integer> myHashSet = new MyHashSet<>();
        myHashSet.add(25);
        myHashSet.add(26);
        myHashSet.add(27);
        myHashSet.add(28);
        myHashSet.add(29);

        System.out.println(myHashSet.toString());
        //Не могу понять почему при вызове этого метода не нужно вызывать метод toString
        //Хотя ведь именно с его помощью данные выводятся в кончоль, и без него это не работает
    }
}
