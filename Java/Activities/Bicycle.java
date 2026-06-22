package com.activities;
class Bicycle implements BicycleParts, BicycleOperations {

    int gears;
    int currentSpeed;

    // Constructor
    Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }

    // Implement applyBrake()
    public void applyBrake(int decrement) {
        currentSpeed -= decrement;
        System.out.println("Speed after applying brake: " + currentSpeed);
    }

    // Implement speedUp()
    public void speedUp(int increment) {
        currentSpeed += increment;
        System.out.println("Speed after speeding up: " + currentSpeed);
    }

    // Method to describe the bicycle
    void bicycleDesc()  {
        System.out.println("Number of gears: " + gears);
        System.out.println("Maximum speed: " + maxSpeed);
    }
}

