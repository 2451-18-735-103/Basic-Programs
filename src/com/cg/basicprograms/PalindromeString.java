package com.cg.basicprograms;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String args[]) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter a String");
    	String s=sc.nextLine();
    	String rev="";
    	for(int i=s.length()-1;i>=0;i--)
    	{
    		rev=rev+s.charAt(i);
    	}
    	if(s.equals(rev))
    	{
    		System.out.println("It is a Palindrome String");
    	}
    	else
    	{
    		System.out.println("It is not a Palindrome String");
    	}
    }
}
