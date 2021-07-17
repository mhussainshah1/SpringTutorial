package me.kodysimpson.primaryandqualifiers.services;

import me.kodysimpson.primaryandqualifiers.model.Vehicle;
import me.kodysimpson.primaryandqualifiers.model.VehicleType;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service("bus")
public class BusProviderServiceImpl implements VehicleProviderService{
    @Override
    public Vehicle getVehicle() {
        return new Vehicle(VehicleType.BUS, UUID.randomUUID());
    }
}
