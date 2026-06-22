package com.activities;

public class Activity6 {

	    public static void main(String[] args) {

	       
	        Plane plane = new Plane(10);

	        plane.onboard("Deepa");
	        plane.onboard("Lishan");
	        plane.onboard("Bhuvan");
	        plane.onboard("Sanny");

	        
	        System.out.println("Takeoff Time: " + plane.takeOff());

	     
	        System.out.println("Passengers: " + plane.getPassengers());

	        
	        try {
	            Thread.sleep(5000);
	        } catch (InterruptedException e) {
	            System.out.println("Thread interrupted");
	        }

	       
	        plane.land();

	     
	        System.out.println("Landing Time: " + plane.getLastTimeLanded());
	    }
	}
	

