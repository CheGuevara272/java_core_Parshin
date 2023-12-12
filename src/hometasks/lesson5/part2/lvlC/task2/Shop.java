package hometasks.lesson5.part2.lvlC.task2;

public class Shop {
    private String name;
    private String workingHours;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.getName() + ", working hours: " + this.getWorkingHours());
    }
}
