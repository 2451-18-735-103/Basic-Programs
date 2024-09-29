package com.cg.basicprograms;

import java.util.Arrays;
import java.util.Scanner;

public class StringInAlphabeticalOrder {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	String name=sc.nextLine();
	
	char ch[]=name.toCharArray();
	Arrays.sort(ch);
	System.out.println(ch);
}
}
