package task8;

public class Main {
    public static void main(String[] args) {
    MuseumSystem museumSystem = new MuseumSystem();

    museumSystem.addExhibit(new Manuscript());
    museumSystem.descriptionExhibit();

    museumSystem.addExhibit(new Sculpture());
    museumSystem.descriptionExhibit();
    }
}



/*
Условие:
В музее выставлен экспонат.
У каждого экспоната своя история и условия хранения.
Примеры:
Манускрипт — требует контролируемой влажности
Скульптура — нуждается в реставрации
Нужно создать систему, которая управляет экспонатом и предоставляет информацию о нём.
 */