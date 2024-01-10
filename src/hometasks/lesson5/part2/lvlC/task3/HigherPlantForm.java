package hometasks.lesson5.part2.lvlC.task3;

public class HigherPlantForm extends Plants {
    @Override
    public void grow(boolean sun, boolean water) {
        if (sun && water) {
            System.out.println("Plant grows");
        } else {
            System.out.println("Plant dies");
        }
    }
}
