package task8;

public class Sculpture extends Exhibit {
    @Override
    void description(){
        System.out.println("Скульптура");
    }

    @Override
    void care(){
        System.out.println("Нуждается в реставрации");
    }
}