package task7;

public class RollerСoaster extends Amusement {

    @Override
    void description(){
        System.out.println("Для посетителей: Осторожно, страшно!");
    }

    @Override
    void service(){
        System.out.println("Обслуживание: проверка безопасности");
    }

}
