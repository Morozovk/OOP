package task5;

public class Main {
    public static void main(String[] args) {
        FarmSystem farmSystem = new FarmSystem();

        farmSystem.addFarmPet(new Chicken());
        farmSystem.showBehavior();
    }
}


/*
Условие:
На ферме содержится одно домашнее животное.
У каждого животного свои функции и нужды.
Примеры:
Корова даёт молоко, нуждается в выпасе
Курица несёт яйца, требует зерно
Нужно создать систему, которая позволяет управлять животным с учётом его потребностей.
 */