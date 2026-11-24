package task1;

public class Elephant extends Animal {

    @Override
    void sound(){
        System.out.println("Трубит");
    }

    @Override
    void move(){
        System.out.println("Ходит");
    }
}
