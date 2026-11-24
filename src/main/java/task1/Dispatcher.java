package task1;

public class Dispatcher {
    private Animal animal;

    void addAnimal(Animal animal){
        this.animal = animal;
        System.out.println("Животное добавлено:");
    }

    void showTheBehavior(){
        animal.sound();
        animal.move();
    }

}
