package task1;

public class Main {
    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher();

        dispatcher.addAnimal(new Elephant());
        dispatcher.showTheBehavior();
    }
}

/*
Условие:
В зоопарке есть одно животное, но оно может быть разным: птица или слон.
Каждое животное издаёт уникальные звуки и передвигается по-своему.
Например, слон трубит и ходит, а птица чирикает и летает.
Нужно спроектировать систему, которая может работать с любым животным, добавлять его в зоопарк и
демонстрировать его поведение.
 */
