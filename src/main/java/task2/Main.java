package task2;

public class Main {
    public static void main(String[] args) {
        PetControlSystem petControlSystem = new PetControlSystem();

        petControlSystem.visiblePet(new Cat());
        petControlSystem.displayingTheDescription();
    }
}


/*
Условие:
В системе может быть один домашний питомец, у каждого вида свои особенности ухода.
Примеры:
Собака гуляет и ест сухой корм
Кошка играет и ест влажный корм
Нужно спроектировать систему, которая позволяет взаимодействовать с любым питомцем с учётом его особенностей.

 */