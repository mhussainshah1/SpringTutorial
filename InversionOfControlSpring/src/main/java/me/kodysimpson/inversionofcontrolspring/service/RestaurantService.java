package me.kodysimpson.inversionofcontrolspring.service;

import org.springframework.stereotype.Service;

@Service
public class RestaurantService {
    private final KitchenService kitchenService;

    public RestaurantService(KitchenService kitchenService){
        this.kitchenService = kitchenService;
    }

    public void processOrder(){
        System.out.println("New order started");
        kitchenService.cookFood();
    }
}
