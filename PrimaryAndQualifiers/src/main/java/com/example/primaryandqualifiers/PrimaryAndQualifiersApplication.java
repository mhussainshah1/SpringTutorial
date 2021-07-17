package com.example.primaryandqualifiers;

import com.example.primaryandqualifiers.model.Vehicle;
import com.example.primaryandqualifiers.services.PublicTransportationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PrimaryAndQualifiersApplication {

    public static void main(String[] args) {
        ApplicationContext context =SpringApplication.run(PrimaryAndQualifiersApplication.class, args);
        PublicTransportationService publicTransportationService = context.getBean(PublicTransportationService.class);
        Vehicle vehicle = publicTransportationService.startTrip();
        publicTransportationService.endTrip(vehicle);
    }

}
