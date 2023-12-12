package hometasks.lesson5.part2.lvlB.task1;

public class Mitsubishi extends Vehicle {
    public Mitsubishi(int view, int speed, int seatComfort, int security, int temperatureInside) {
        this.view = view;
        this.speed = speed;
        this.seatComfort = seatComfort;
        this.security = security;
        this.temperatureInside = temperatureInside;
        averageScore = (view + speed + seatComfort + security + temperatureInside) / 5;
    }

    public void move() {
        System.out.println("Mitsubishi carries passengers with an average rating of " + averageScore);
    }
}
