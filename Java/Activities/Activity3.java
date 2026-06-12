package com.activities;

public class Activity3 {
	public static void main(String[] args)
	{
		Activity3 obj =new Activity3();
		System.out.println(obj.adjustDevice("THERMOSTAT", 40));
		System.out.println(obj.adjustDevice("THERMOSTAT", 37));
		System.out.println(obj.adjustDevice("LIGHT", 60));
		System.out.println(obj.adjustDevice(null,0));
	}
	public String  adjustDevice(String device, int value) 
	{
		if (device == null)
		{
			  return "[Error] Device is null.";
		}
		if (device .equals("THERMOSTAT") && value >= 40)
		{
			 return "[Thermostat] Warning: Temperature high.";
		}
		else if (device.equals("THERMOSTAT")) 
		{
			return "[Thermostat] Temperature is set to " + value + ".";
		}
		else if (device.equals("LIGHT")) {
	            return "[Light] Adjusting brightness to " + value + "%.";
	        } 
	    else 
	    {
	            return "[Error] Unknown device.";
	        }
	}
}


