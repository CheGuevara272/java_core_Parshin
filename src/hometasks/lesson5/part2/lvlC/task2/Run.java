package hometasks.lesson5.part2.lvlC.task2;

public class Run {
    public static void main(String[] args) {
        Boutique gucci = new Boutique();
        HardwareStore oma = new HardwareStore();
        Supermarket proStore = new Supermarket();
        DepartmentStore cum = new DepartmentStore();

        gucci.setName("Gucci");
        gucci.setWorkingHours("From 10:00 to 21:00");
        gucci.displayInfo();

        oma.setName("OMA");
        oma.setWorkingHours("From 8:00 to 23:00");
        oma.displayInfo();

        proStore.setName("ProStore");
        proStore.setRoundTheHours(true);
        proStore.displayInfo();

        cum.setName("CUM");
        cum.setRoundTheHours(false);
        cum.setWorkingHours("From 9:00 to 22:00");
        cum.displayInfo();
    }
}
