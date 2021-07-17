package com.example.primaryandqualifiers.services;

import com.example.primaryandqualifiers.model.Vehicle;
import com.example.primaryandqualifiers.model.VehicleType;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service("bus")
public class BusProviderServiceImpl implements VehicleProviderService{
    @Override
    public Vehicle getVehicle() {
        return new Vehicle(VehicleType.BUS, UUID.randomUUID());
    }
}
