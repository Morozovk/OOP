package task8;

public class Manuscript extends Exhibit {

    @Override
    void description(){
        System.out.println("Манускрипт");
    }

    @Override
    void care(){
        System.out.println("Требует контролируемой влажности");
    }
}
