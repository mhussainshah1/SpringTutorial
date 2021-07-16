package me.kodysimpson.codingtoaninterface.services;

import me.kodysimpson.codingtoaninterface.model.Vehicle;
import me.kodysimpson.codingtoaninterface.model.VehicleType;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BusProviderServiceImpl implements VehicleProviderService{
    @Override
    public Vehicle getVehicle() {
        return new Vehicle(VehicleType.BUS, UUID.randomUUID());
    }
}
