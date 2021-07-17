package com.example.primaryandqualifiers.services;

import com.example.primaryandqualifiers.model.Vehicle;
import com.example.primaryandqualifiers.model.VehicleType;
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
