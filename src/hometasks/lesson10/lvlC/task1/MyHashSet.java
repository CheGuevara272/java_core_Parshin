package hometasks.lesson10.lvlC.task1;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyHashSet<T> implements Set<T> {
    private Set<T> myHashSet = new HashSet<>();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyHashSet{");
        sb.append("myHashSet=").append(myHashSet);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int size() {
        return myHashSet.size();
    }

    @Override
    public boolean isEmpty() {
        return myHashSet.isEmpty();
    }

    @Override
    public boolean add(T t) {
        return myHashSet.add(t);
    }

    @Override
    public boolean remove(Object o) {
        return myHashSet.remove(o);
    }

    @Override
    public boolean contains(Object o) {
        return myHashSet.contains(o);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return myHashSet.addAll(c);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return myHashSet.containsAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return myHashSet.removeAll(c);
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
