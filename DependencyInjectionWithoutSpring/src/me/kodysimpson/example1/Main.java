package me.kodysimpson.example1;

public class Main {

    public static void main(String[] args) {
        //Dependency Injection
        var kitchenService = new KitchenService();
        var restaurantService = new RestaurantService(kitchenService);
        restaurantService.processOrder();
    }
}
