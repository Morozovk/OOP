package task3;

public class Main {
    public static void main(String[] args) {
        SystemRestaurantMenu systemRestaurantMenu = new SystemRestaurantMenu();

        systemRestaurantMenu.addDish(new HotDish(45));
        systemRestaurantMenu.displayingTheDescription();
    }
}


/*
Условие:
В меню ресторана добавляется блюдо.
У каждого блюда свои параметры отображения:
Горячее блюдо — с температурой
Напиток — с объёмом
Нужно спроектировать систему, в которой можно добавлять блюда и выводить их описание с учётом характеристик.
 */