package task8;

public class MuseumSystem {
    private Exhibit exhibit;

    void visibleExhibit(Exhibit exhibit) {
        this.exhibit = exhibit;
    }

    void descriptionExhibit(){
        exhibit.description();
        exhibit.care();
    }
}
