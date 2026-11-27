package task2;

public class PetControlSystem {
    private HomePets pet;

    void addPet(HomePets pet){
        System.out.println("Обнаружен питомец: ");
        this.pet = pet;
    }

    void displayingTheDescription(){
        pet.peculiarity();
        pet.care();
    }
}
