package com.cg.basicprograms;
import java.util.*;
public class Demo {
   public static void main(String args[]) {
	// Create a new HashMap with key as String and value as Integer
	   HashMap<String,Integer> map=new HashMap<>();
	// Adding key-value pairs to the HashMap
	   map.put("manasa", 50);
	   map.put("lalitha", 40);
	   map.put("nirupama", 45);
	   map.put("Anitha", 60);
	   
	// Accessing elements by key
	   System.out.println("manasa score:"+map.get("manasa"));
	// Modifying an existing value
	   map.put("lalitha", 50);
	// Removing an element by key
	   map.remove("nirupama");
	// Checking if a key exists in the HashMap
	   System.out.println(map.containsKey("manasa"));
	// Checking if a value exists in the HashMap
	   System.out.println(map.containsValue(90));
	// Getting the size of the HashMap
	   System.out.println(map.size());
       System.out.println(map.isEmpty());
	   //based on key it will sort elements in sorted order
	   TreeMap<String, Integer> sortedMap = new TreeMap<>(map);
	   
	   System.out.println("Iterating through HashMap using for-each loop:");
       for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
           String name = entry.getKey();
           int score = entry.getValue();
           System.out.println(name + ": " + score);
       }
       
   }
}
