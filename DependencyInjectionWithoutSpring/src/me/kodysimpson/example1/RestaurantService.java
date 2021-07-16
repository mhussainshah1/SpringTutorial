package me.kodysimpson.example1;

public class RestaurantService {
    //dependency
    private KitchenService kitchenService;

    public RestaurantService() {
        //tightly coupled
        this.kitchenService = new KitchenService();
    }

    //loosely Couple
    public RestaurantService(KitchenService kitchenService) {
        this.kitchenService = kitchenService;
    }

    public void processOrder() {
        System.out.println("New Order started.");
        kitchenService.cookFood();
    }
}
