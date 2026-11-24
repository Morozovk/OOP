package task5;

public class FarmSystem {
    private FarmPet farmPet;

    void visibleFarmPet(FarmPet farmPet){
        System.out.println("Обноруженно животное:");
        this.farmPet = farmPet;
    }

    void displayingTheDescription(){
        farmPet.getProduct();
        farmPet.getEat();
    }

}
