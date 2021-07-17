package com.example.primaryandqualifiers.model;

import java.util.UUID;

public class Vehicle {

    private UUID registrationNumber;
    private VehicleType type;

    public Vehicle(VehicleType type, UUID registrationNumber){
        this.type = type;
        this.registrationNumber = registrationNumber;
    }

    public UUID getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(UUID registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }
}
