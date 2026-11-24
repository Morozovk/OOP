package task5;

public class Chicken extends FarmPet{
    @Override
    void getProduct(){
        System.out.println("Дает яйца");
    }

    void getEat(){
        System.out.println("Требует зерно");
    }
}
