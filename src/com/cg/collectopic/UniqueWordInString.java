package com.cg.collectopic;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueWordInString {
  public static void main(String args[]) {
	  Scanner sc=new Scanner(System.in);
	   System.out.println("Enter a string");
	   String s=sc.nextLine();
	    String m=s.toLowerCase();
	   String sentArray[]=m.split(" ");
	   Set<String> uniquewords=new HashSet<>();
	   for(String word:sentArray) {
		   
		   uniquewords.add(word);
	   }
	   for(String word:uniquewords) {
		   System.out.println(word);
	   }
	   
	  
	  
	  
	  
	  
	  
	  

	  
  }
}
