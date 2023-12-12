package hometasks.lesson5.part2.lvlC.task1;

public class Run {
    public static void main(String[] args) {
        Belarusian jenya = new Belarusian();
        Russian kirill = new Russian();
        Ukrainian andrej = new Ukrainian();

        jenya.setName("Jenya");
        jenya.setAge(23);
        jenya.displayInfo();
        jenya.belarusianStereotype();

        kirill.setName("Kirill");
        kirill.setAge(24);
        kirill.displayInfo();
        kirill.russianStereotype();

        andrej.setName("Andrej");
        andrej.setAge(20);
        andrej.displayInfo();
        andrej.ukrainianStereotype();
    }
}
