package com.cg.collectopic;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LargestWordInSentence {
   public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
		  System.out.println("Enter a string");
		  String sentence=sc.nextLine();
		  String sentArray[]=sentence.split(" ");
		  int largestwordlength=0;
		  String largestWord="";
		  for(String word:sentArray) {
			  if(word.length()>largestwordlength) {
				  largestWord=word;
				  largestwordlength=word.length();
			  }
		  }
		  System.out.println("Largest word "+largestWord);
   }
}
