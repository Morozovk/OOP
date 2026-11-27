package task5;

public class Chicken extends FarmPet{
    @Override
    void getProduct(){
        System.out.println("Дает яйца");
    }

    @Override
    void getEat(){
        System.out.println("Требует зерно");
    }
}
