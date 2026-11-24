package task4;

public class SystemAquarium {
    private SeaCreature seaCreature;

    void addSeaCreature(SeaCreature seaCreature) {
        System.out.println("Добавлено морское существо, сейчас оно: ");
        this.seaCreature = seaCreature;
    }

    void displayingTheDescription(){
        seaCreature.behavior();
        }
    }

