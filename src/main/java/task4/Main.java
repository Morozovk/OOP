package task4;

public class Main {
    public static void main(String[] args) {
        SystemAquarium systemAquarium = new SystemAquarium();

        systemAquarium.addSeaCreature(new Shark());
        systemAquarium.displayingTheDescription();
    }
}



/*
Условие:
В аквариуме может находиться одно морское существо.
В зависимости от существа, оно ведёт себя по-разному.
Примеры:
Акула плавает быстро и агрессивно
Морская звезда медленно ползает
Нужно спроектировать систему, в которой можно добавить существо и продемонстрировать его поведение.
 */