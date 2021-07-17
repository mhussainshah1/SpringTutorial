package me.kodysimpson.profiles.services;

import me.kodysimpson.profiles.model.Vehicle;
import me.kodysimpson.profiles.model.VehicleType;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Profile({"default","taxi"}) //If no profile mentioned in properties file then it will be autowired as default
public class TaxiProviderServiceImpl implements VehicleProviderService {

    @Override
    public Vehicle getVehicle() {
        return new Vehicle(VehicleType.TAXI, UUID.randomUUID());
    }


}
