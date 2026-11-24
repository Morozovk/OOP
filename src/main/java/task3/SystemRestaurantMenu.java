package task3;

public class SystemRestaurantMenu {
    private Dish dish;

    void addDish(Dish dish){
        this.dish = dish;
    }

    void displayingTheDescription(){
        dish.description();
    }
}
