package task1;

public class Bird extends Animal {

    @Override
    void sound(){
        System.out.println("Чирикает");
    }

    @Override
    void move(){
        System.out.println("Летает");
    }
}
