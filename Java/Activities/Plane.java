package com.activities;

	import java.time.LocalDateTime;
	import java.util.ArrayList;


	class Plane {

	  
	    private int maxPassengers;
	    private ArrayList<String> passengers;
	    private LocalDateTime lastTimeLanded;
	    private LocalDateTime takeOffTime;


	    Plane(int maxPassengers) {
	        this.maxPassengers = maxPassengers;
	        this.passengers = new ArrayList<>();
	    }

	    void onboard(String passengerName) {
	        if (passengers.size() < maxPassengers) {
	            passengers.add(passengerName);
	            System.out.println(passengerName + " boarded.");
	        } else {
	            System.out.println("Plane is full!");
	        }
	    }

	    
	    LocalDateTime takeOff() {
	        takeOffTime = LocalDateTime.now();
	        return takeOffTime;
	    }

	   
	    void land() {
	        lastTimeLanded = LocalDateTime.now();
	        passengers.clear();
	        System.out.println("Plane landed.");
	    }

	    
	    LocalDateTime getLastTimeLanded() {
	        return lastTimeLanded;
	    }

	   
	    ArrayList<String> getPassengers() {
	        return passengers;
	    }
	}	
	

