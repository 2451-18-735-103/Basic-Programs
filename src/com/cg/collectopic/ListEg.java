package com.cg.collectopic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListEg {
  public static void main(String args[]) {
	  List<String> list=new ArrayList<>();
	  //adding
	  list.add("Manasa");
	  list.add("Lalitha");
	  list.add("Sruthi");
	  //get
	  System.out.println("The element at first index is: "+list.get(1));
	  //update(or)set
	  list.set(0, "Priya");
	  //print list elements
	  for(String s:list) {
		  System.out.println(s);
	  }
	  //remove
	 boolean b=list.remove("Lalitha");
	 //size
	 int size=list.size();
	 System.out.println(size);
	 //contains
	 boolean c=list.contains("Sruthi");
	 System.out.println(c);
	 //isEmpty
	 boolean d=list.isEmpty();
	 System.out.println(d);
	 System.out.println("PRINTING LIST in sorted order");
	 Collections.sort(list);
	 for(String f:list) {
		 System.out.println(f);
	 }
	  list.add("Manasa");
	  list.add("Surya");
		 //***********************second list********************************
		 
		 List<String> list1=new ArrayList<>();
		 list1.add("swathi");
		 list1.add("Surya");
		 list1.add("Manasa");
		 
	      boolean g=list.containsAll(list1);
	      System.out.println(g);
	      
	      list.addAll(list1);
	      
	      for(String s:list) {
	    	  System.out.println(s);
	      }
	      
	      boolean x=list.removeAll(list1);
	      System.out.println("##########################");
	      for(String s:list) {
	    	  System.out.println(s);
	      }
  }
}
