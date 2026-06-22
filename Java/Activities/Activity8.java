package com.activities;


import java.util.ArrayList;
public class Activity8 {
       public static void main(String args[])
{
	   ArrayList<String> myList = new ArrayList<String>();
	   
	   myList.add("Apple");
       myList.add("Mango");
       myList.add("Orange");
       myList.add(1,"Grapes");
       myList.add(4,"litchi");
       

       System.out.println("List of names:");
              for (int i = 0; i < myList.size(); i++) 
              {
                  System.out.println(myList.get(i));
              }
              System.out.println("\n3rd name: " + myList.get(2));
              

       if (myList.contains("Grapes")) {
            System.out.println("\ngrapes is present in the list.");
        } else {
            System.out.println("\ngrapes is not present in the list.");
        }
       System.out.println("\nNumber of names: " + myList.size());

       myList.remove("litchi");
      
       System.out.println("Number of names after removing: " + myList.size());
                   
}


}