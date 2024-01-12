package hometasks.lesson10_1.levelC.task2;


/*Создать класс MyHashMap с имплементацией интерфейса Map<K,V>.
  Реализовать методы:
    put(K key, V value)
    get(Object key)
    remove(Object key)

  Создайте класс Run и в методе main продемонстрировать работу методов.*/

public class Runner {
    public static void main(String[] args) {
        MyHashMap<String, Integer> myHashMap = new MyHashMap();
        myHashMap.put("Jenya", 20);
        myHashMap.put("Artem", 10);
        myHashMap.put("Sasha", 40);

        System.out.println(myHashMap.get("Jenya"));
        System.out.println(myHashMap.get("Sasha"));

        myHashMap.remove("Artem");
    }
}
