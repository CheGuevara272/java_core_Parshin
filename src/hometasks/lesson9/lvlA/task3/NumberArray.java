package hometasks.lesson9.lvlA.task3;

public class NumberArray {
    private Number[] numberArray = new Number[5];


    public void setElement(int index, Number element) {
        this.numberArray[index] = element;
    }

    public Number getElement(int index) {
        System.out.println(this.numberArray[index].getClass());
        return this.numberArray[index];
    }

    public void printArray() {
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println(this.numberArray[i] + ": " + this.numberArray[i].getClass());
        }
    }
}
