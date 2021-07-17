package me.kodysimpson.primaryandqualifiers.services;

import me.kodysimpson.primaryandqualifiers.model.Vehicle;
import me.kodysimpson.primaryandqualifiers.model.VehicleType;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Primary //Primary /Default - Service to autowire if implementation is not provided
public class TrainProviderServiceImpl implements VehicleProviderService{

    @Override
    public Vehicle getVehicle() {
        return new Vehicle(VehicleType.TRAIN, UUID.randomUUID());
    }
}
