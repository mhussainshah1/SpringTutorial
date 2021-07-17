package me.kodysimpson.profiles;

import me.kodysimpson.profiles.model.Vehicle;
import me.kodysimpson.profiles.services.PublicTransportationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProfilesApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ProfilesApplication.class, args);

        PublicTransportationService publicTransportationService = context.getBean(PublicTransportationService.class);
        Vehicle vehicle = publicTransportationService.startTrip();
        publicTransportationService.endTrip(vehicle);
    }
}
