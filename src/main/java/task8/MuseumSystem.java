package task8;

public class MuseumSystem {
    private Exhibit exhibit;

    void addExhibit(Exhibit exhibit) {
        this.exhibit = exhibit;
    }

    void descriptionExhibit(){
        exhibit.description();
        exhibit.care();
    }
}
