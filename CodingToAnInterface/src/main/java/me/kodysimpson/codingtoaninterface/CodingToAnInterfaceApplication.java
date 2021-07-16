package me.kodysimpson.codingtoaninterface;

import me.kodysimpson.codingtoaninterface.model.Vehicle;
import me.kodysimpson.codingtoaninterface.services.PublicTransportationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CodingToAnInterfaceApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(CodingToAnInterfaceApplication.class, args);

        PublicTransportationService publicTransportationService = context.getBean(PublicTransportationService.class);
        Vehicle vehicle = publicTransportationService.startTrip();
        publicTransportationService.endTrip(vehicle);
    }

}
