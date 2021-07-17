package me.kodysimpson.primaryandqualifiers.services;

import me.kodysimpson.primaryandqualifiers.model.Vehicle;
import me.kodysimpson.primaryandqualifiers.model.VehicleType;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service("taxi")
public class TaxiProviderServiceImpl implements VehicleProviderService{

    @Override
    public Vehicle getVehicle() {
        return new Vehicle(VehicleType.TAXI, UUID.randomUUID());
    }


}
