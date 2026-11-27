package task5;

public class FarmSystem {
    private FarmPet farmPet;

    void addFarmPet(FarmPet farmPet){
        System.out.println("Обноруженно животное:");
        this.farmPet = farmPet;
    }

    void showBehavior(){
        farmPet.getProduct();
        farmPet.getEat();
    }

}
