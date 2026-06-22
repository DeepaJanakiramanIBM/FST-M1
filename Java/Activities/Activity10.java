package com.activities;

import java.util.HashMap;

public class Activity10 {

	public static void main(String args[]) {
		
		HashMap<Integer, String> colours = new HashMap<>();
		
		colours.put(1,"Black");
		colours.put(2,"Blue");
		colours.put(3,"Green");
		colours.put(4,"Yellow");
		colours.put(5,"Red");
		
		System.out.println("Hashmap list:"+colours);
		System.out.println("Remove the colur:"+colours.remove(2));
		System.out.println("Red in the list:"+colours.containsValue("Red"));
		System.out.println("Updated Hashmap list:"+colours);
	}
	
}
