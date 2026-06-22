package com.activities;

import java.util.HashSet;

public class Activity9 {

	 public static void main(String[] args) {
		 HashSet<String> hs = new HashSet<>();
		 
		        hs.add("car");
		        hs.add("Banana");
		        hs.add("Mango");
		        hs.add("Orange");
		        hs.add("Grapes");
		        hs.add("Pineapple");
		        
		    System.out.println("Original HashSet: " + hs);     
		    System.out.println("size of the HashSet: "+hs.size());
		    System.out.println("After remove of the HashSet: "+hs.remove("Grapes"));
		    if(hs.remove("Deeps")) {
	        	System.out.println("Deeps removed from the Set");
	        } else {
	        	System.out.println("Deeps is not present in the Set");
	        }
		    System.out.println("Litchi in the HashSet: "+hs.contains("Litchi"));
		    System.out.println("Updated Set: "+hs);
	 }
}

