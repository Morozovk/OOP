package task7;

public class AmusementPark {
    private Amusement amusement;

    void addAmusement(Amusement amusement){
        this.amusement = amusement;
    }

    void serviceDescription(){
        amusement.service();
    }

    void descriptionForVisitor(){
        amusement.description();
    }
}
