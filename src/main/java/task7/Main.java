package task7;

public class Main {
    public static void main(String[] args) {

        AmusementPark amusementPark = new AmusementPark();

        amusementPark.visibleAmusement(new Carousel());
        amusementPark.descriptionForVisitor();
        amusementPark.serviceDescription();
    }
}



/*
Условие:
В парке есть аттракцион, каждый из которых предлагает свои ощущения и требует обслуживания.
Примеры:
Американские горки — проверка безопасности
Карусель — техническое обслуживание
Нужно создать систему, которая управляет аттракционом и выводит информацию для посетителей.
 */