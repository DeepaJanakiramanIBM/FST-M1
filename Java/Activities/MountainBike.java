package com.activities;

public class MountainBike extends Bicycle 
{

    int seatHeight;

    // Constructor
    MountainBike(int gears, int currentSpeed, int seatHeight) {
        super(gears, currentSpeed); // call parent constructor
        this.seatHeight = seatHeight;
    }

    // Method to set seat height
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    // Override bicycleDesc()
    @Override
    void bicycleDesc() {
        super.bicycleDesc(); // call parent method
        System.out.println("Seat height: " + seatHeight);
    }
}

