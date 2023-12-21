package hometasks.lesson10.lvlB.task2;

import java.util.*;

public class MyArrayList<T> implements List<T> {
    List<T> myArrayList = new ArrayList<>();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyArrayList{");
        sb.append("myArrayList=").append(myArrayList);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean add(T t) {
        return myArrayList.add(t);
    }

    @Override
    public T remove(int index) {
        return myArrayList.remove(index);
    }

    @Override
    public T get(int index) {
        return myArrayList.get(index);
    }

    @Override
    public T set(int index, T element) {
        return myArrayList.set(index, element);
    }

    @Override
    public void add(int index, T element) {
        myArrayList.add(index, element);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return myArrayList.addAll(c);
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
