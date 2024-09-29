package com.cg.collectopic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
//java code to input a sentence and arrange the words in ascending order 
//of their lengths
public class SortWordsByLength {
  public static void main(String args[]) {
	  Scanner sc=new Scanner(System.in);
	  String sentence=sc.nextLine();
	  String words[]=sentence.split(" ");
	  Arrays.sort(words,Comparator.comparingInt(String::length));
	                           //comparing(String::length.reversed()) for descending order
	  
	  for(String word:words) {
		  System.out.println(word);
	  }
	  
	
  }
}
