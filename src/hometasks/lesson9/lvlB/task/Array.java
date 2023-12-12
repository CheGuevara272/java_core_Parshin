package hometasks.lesson9.lvlB.task;

public class Array {
    private Object[] array = new Object[10];

    public void setElement(Object element) {
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] == null) {
                this.array[i] = element;
                break;
            } else if (i == this.array.length - 1) {
                extendArray();
                setElement(element);
                break;
            }
        }
    }

    public Object getElement(int index) {
        return this.array[index];
    }

    public boolean contains(Object element) {
        for (Object item : this.array) {
            if (item == element) return true;
        }
        return false;
    }

    public String getIndex(Object element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) return String.valueOf(i);
        }
        return "No such element";
    }

    public void printArray() {
        for (Object item : this.array) {
            if (item != null) {
                System.out.println(item + ", " + item.getClass());
            } else {
                System.out.println("null");
            }
        }
    }

    private void extendArray() {
        Object[] arrayCopy = array.clone();
        array = new Object[arrayCopy.length * 2];
        System.arraycopy(arrayCopy, 0, this.array, 0, arrayCopy.length);
    }

    public void deleteElement(Object element) {
        int index;
        if (contains(element)) {
            index = Integer.parseInt(getIndex(element));
            deleteElement(index);
        }
    }

    public void deleteElement(int index) {
        Object[] arrayCopy = array.clone();
        array = new Object[arrayCopy.length];
        System.arraycopy(arrayCopy, 0, this.array, 0, index);
        System.arraycopy(arrayCopy, index + 1, this.array, index, arrayCopy.length - index - 1);
    }
}
