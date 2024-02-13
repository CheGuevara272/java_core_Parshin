package hometasks.lesson10.lvlB.task3;

import java.util.*;

/*Создать класс MyHashSet с имплементацией интерфейса Set<T>. Не использовать реализацию HashSet из JDK, но можно подсмотреть в неё!
  Реализовать методы:
    toString()
    size()
    isEmpty()
    add(T e)
    remove(Object o)
    contains(Object o)
*/

public class MyHashSet<T> implements Set<T> {
    private static final Object PRESENT = new Object();
    private final transient HashMap<T, Object> map;

    public MyHashSet() {
        map = new HashMap<>();
    }

    public MyHashSet(Collection<? extends T> c) {
        map = new HashMap<>(Math.max((int) (c.size() / .75f) + 1, 16));
        addAll(c);
    }

    public MyHashSet(int initialCapacity, float loadFactor) {
        map = new HashMap<>(initialCapacity, loadFactor);
    }

    public MyHashSet(int initialCapacity) {
        map = new HashMap<>(initialCapacity);
    }

    @Override
    public String toString() {
        String sb = "MyHashSet{" + "map=" + map +
                '}';
        return sb;
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean add(T t) {
        return map.put(t, PRESENT) == null;
    }

    @Override
    public boolean remove(Object o) {
        return map.remove(o) == PRESENT;
    }

    @Override
    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        boolean modified = false;
        for (T t : c)
            if (add(t))
                modified = true;
        return modified;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object e : c)
            if (!contains(e))
                return false;
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        Objects.requireNonNull(c);
        boolean modified = false;
        Iterator<?> it = iterator();
        while (it.hasNext()) {
            if (c.contains(it.next())) {
                it.remove();
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
