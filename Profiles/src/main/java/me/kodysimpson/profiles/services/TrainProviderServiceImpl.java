package me.kodysimpson.profiles.services;

import me.kodysimpson.profiles.model.Vehicle;
import me.kodysimpson.profiles.model.VehicleType;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Profile({"train" , "dev"})
public class TrainProviderServiceImpl implements VehicleProviderService{

    @Override
    public Vehicle getVehicle() {
        return new Vehicle(VehicleType.TRAIN, UUID.randomUUID());
    }
}
