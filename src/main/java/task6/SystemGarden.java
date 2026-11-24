package task6;

public class SystemGarden {
    private Plant plant;

    void addPlant(Plant plant){
        System.out.println("Растение требует: ");
        this.plant = plant;
    }

    void carePlant(){
        plant.care();
    }
}
