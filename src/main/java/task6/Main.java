package task6;

public class Main {
    public static void main(String[] args) {
        SystemGarden systemGarden = new SystemGarden();

        systemGarden.addPlant(new Orchid());
        systemGarden.carePlant();
    }
}



/*
Условие:
В ботаническом саду содержится одно растение.
У разных растений — разные требования к уходу.
Примеры:
Орхидея — высокая влажность и тень
Кактус — много света, редкий полив
Нужно спроектировать систему, в которой можно добавить растение и обеспечить нужный уход.
 */