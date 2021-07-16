package me.kodysimpson.codingtoaninterface.services;

import me.kodysimpson.codingtoaninterface.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublicTransportationService {

    private final VehicleProviderService vehicleProviderService;

    @Autowired
    public PublicTransportationService(VehicleProviderService trainProviderServiceImpl) {
        this.vehicleProviderService = trainProviderServiceImpl;
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
