package me.kodysimpson.profiles.services;

import me.kodysimpson.profiles.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PublicTransportationService {

    //Field Injection
/*    @Autowired
    @Qualifier("bus")*/
    private VehicleProviderService vehicleProviderService;

    //Constructor Injection
/*    @Autowired
    public PublicTransportationService(@Qualifier("taxi") VehicleProviderService vehicleProviderService) {
        //@Qualifier //It has precedence over @Primary
        this.vehicleProviderService = vehicleProviderService;
    }*/

    //Setter Injection
    @Autowired
    public void setVehicleProviderService(VehicleProviderService vehicleProviderService) {
        this.vehicleProviderService = vehicleProviderService;
    }

    public Vehicle startTrip() {
        Vehicle vehicle = vehicleProviderService.getVehicle();
        System.out.println(vehicle.getType().toString() + " with registration (#" + vehicle.getRegistrationNumber() + ") has left the station.");
        return vehicle;
    }

    public void endTrip(Vehicle vehicle) {
        System.out.println(vehicle.getType().toString() + " with registration (#" + vehicle.getRegistrationNumber() + ") has arrived at the destination.");
    }
}
