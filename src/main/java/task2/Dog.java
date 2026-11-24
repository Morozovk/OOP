package task2;

public class Dog extends HomePets {

    @Override
    void peculiarity() {
        System.out.println("Ест сухой корм");
    }

    @Override
    void care() {
        System.out.println("Гуляет");
    }
}
