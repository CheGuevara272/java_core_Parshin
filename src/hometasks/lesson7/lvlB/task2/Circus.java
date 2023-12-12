package hometasks.lesson7.lvlB.task2;

public class Circus {
    String name;

    Bear bear;
    Elephant elephant;
    Horse horse;

    public Circus(String name, String bearPoss, String elephantPoss, String horsePoss) {
        this.name = name;
        this.bear = new Bear(bearPoss);
        this.elephant = new Elephant(elephantPoss);
        this.horse = new Horse(horsePoss);
    }

    class Bear {
        String iCan;

        public Bear(String possibility) {
            this.iCan = possibility;
        }

        public void iCan() {
            System.out.println(iCan);
        }
    }

    class Elephant {
        String iCan;

        public Elephant(String possibility) {
            this.iCan = possibility;
        }

        public void iCan() {
            System.out.println(iCan);
        }
    }

    class Horse {
        String iCan;

        public Horse(String possibility) {
            this.iCan = possibility;
        }

        public void iCan() {
            System.out.println(iCan);
        }
    }
}
