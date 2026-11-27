package task5;

public class Cow extends FarmPet{
    @Override
    void getProduct(){
        System.out.println("Дает молоко");
    }

    @Override
    void getEat(){
        System.out.println("Требует выпас");
    }
}
