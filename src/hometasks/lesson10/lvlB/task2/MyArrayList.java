package hometasks.lesson10.lvlB.task2;

import jdk.internal.util.ArraysSupport;

import java.util.*;

/*Создать класс MyArrayList с имплементацией интерфейса List<T>.
  Не использовать реализацию ArrayList из JDK, но можно подсмотреть в неё!
  Реализовать методы:
    toString()
    add(T element)
    remove(int index)
    get(int index)
    set(int index, T element)
    add(int index, T element)
    addAll(Collection<? extends T> c)
*/

public class MyArrayList<T> implements List<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] EMPTY_DATA = {};
    private static final Object[] DEFAULTCAPACITY_EMPTY_DATA = {};
    Object[] data;
    private int size;

    MyArrayList(int initialCapacity) {
        if (initialCapacity > 0) {
            this.data = new Object[initialCapacity];
        } else {
            this.data = EMPTY_DATA;
        }
    }

    MyArrayList() {
        this.data = DEFAULTCAPACITY_EMPTY_DATA;
    }

    @Override
    public String toString() {
        String sb = "MyArrayList{" + "data=" + Arrays.toString(data) +
                '}';
        return sb;
    }

    private void add(T t, Object[] data, int s) {
        if (s == data.length)
            data = grow();
        data[s] = t;
        size = s + 1;
    }

    @Override
    public boolean add(T t) {
        add(t, data, size);
        return true;
    }

    @Override
    public T remove(int index) {
        Objects.checkIndex(index, size);

        T oldValue = (T) data[index];
        fastRemove(data, index);

        return oldValue;
    }

    private void fastRemove(Object[] es, int i) {
        final int newSize;
        if ((newSize = size - 1) > i)
            System.arraycopy(es, i + 1, es, i, newSize - i);
        es[size = newSize] = null;
    }

    @Override
    public T get(int index) {
        Objects.checkIndex(index, size);
        return data(index);
    }

    @Override
    public T set(int index, T element) {
        Objects.checkIndex(index, size);
        T oldValue = data(index);
        data[index] = element;
        return oldValue;
    }

    @Override
    public void add(int index, T element) {
        final int s;
        Object[] data;
        if ((s = size) == (data = this.data).length)
            data = grow();
        System.arraycopy(data, index,
                data, index + 1,
                s - index);
        data[index] = element;
        size = s + 1;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        Object[] a = c.toArray();
        int numNew = a.length;
        if (numNew == 0)
            return false;
        Object[] data;
        final int s;
        if (numNew > (data = this.data).length - (s = size))
            data = grow(s + numNew);
        System.arraycopy(a, 0, data, s, numNew);
        size = s + numNew;
        return true;
    }


    private Object[] grow(int minCapacity) {
        int oldCapacity = data.length;
        if (oldCapacity > 0 || data != DEFAULTCAPACITY_EMPTY_DATA) {
            int newCapacity = ArraysSupport.newLength(oldCapacity,
                    minCapacity - oldCapacity, /* minimum growth */
                    oldCapacity >> 1           /* preferred growth */);
            return data = Arrays.copyOf(data, newCapacity);
        } else {
            return data = new Object[Math.max(DEFAULT_CAPACITY, minCapacity)];
        }
    }

    private Object[] grow() {
        return grow(size + 1);
    }

    T data(int index) {
        return (T) data[index];
    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
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
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
