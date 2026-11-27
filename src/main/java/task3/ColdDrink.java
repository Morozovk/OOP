package task3;

public class ColdDrink extends Dish{
    private int volumeML;

    public ColdDrink (int volumeML){
        this.volumeML = volumeML;
    }

    @Override
    void description(){
        System.out.println("Объем напитка: " + volumeML);
    }
}
