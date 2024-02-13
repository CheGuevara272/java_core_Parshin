package hometasks.lesson9.lvlA.task2;

public class Array {
    private final Object[] array = new Object[5];


    public void setElement(int index, Object element) {
        this.array[index] = element;
    }

    public Object getElement(int index) {
        System.out.println(this.array[index].getClass());
        return this.array[index];
    }
}
