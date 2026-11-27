package task3;

public class HotDish extends Dish{
private int temperatureCelsius;

    public HotDish(int temperatureCelsius){
        this.temperatureCelsius = temperatureCelsius;
    }

    @Override
    void description(){
        System.out.println("Температура блюда: " + temperatureCelsius);
    }
}
