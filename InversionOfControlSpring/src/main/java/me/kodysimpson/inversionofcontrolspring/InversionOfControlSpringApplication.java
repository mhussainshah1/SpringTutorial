package me.kodysimpson.inversionofcontrolspring;

import me.kodysimpson.inversionofcontrolspring.service.KitchenService;
import me.kodysimpson.inversionofcontrolspring.service.RestaurantService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

// @ComponentScan//Go each of class to see component
@SpringBootApplication
public class InversionOfControlSpringApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(InversionOfControlSpringApplication.class, args);

//        KitchenService kitchenService = (KitchenService) applicationContext.getBean("kitchenService");
        var kitchenService = applicationContext.getBean(KitchenService.class);
        var restaurantService = new RestaurantService(kitchenService);
        restaurantService.processOrder();

        //or
        restaurantService = applicationContext.getBean(RestaurantService.class);
        restaurantService.processOrder();
    }

}
