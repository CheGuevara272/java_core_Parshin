package hometasks.lesson10.lvlC.task2;

import java.util.List;
import java.util.ListIterator;

public class Remover<T> {
    private boolean notRemove = true;

    public List<T> remover(List<T> c) {
        ListIterator<T> listIterator = c.listIterator();
        while (listIterator.hasNext()) {
            if (notRemove == false) {
                listIterator.next();
                listIterator.remove();
                notRemove = true;
            } else {
                listIterator.next();
                notRemove = false;
            }
        }

        List<T> result;
        if (c.size() > 1) {
            System.out.println(c);
            result = remover(c);
        } else {
            result = c;
        }
        return result;
    }
}
