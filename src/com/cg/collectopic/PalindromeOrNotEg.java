package com.cg.collectopic;

import java.util.HashSet;
import java.util.Scanner;

//Java code to input a string to check if it a palindrome and contains atleast
//2 different Vowels.
//If so return true, 
		//else return false
public class PalindromeOrNotEg {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String input=sc.next();
		boolean isPalindromeWithVowel=isPalindromeWithTwoDifferentVowels(input);
		System.out.println(isPalindromeWithVowel);
	}
	public static boolean isPalindromeWithTwoDifferentVowels(String input) {
		input=input.toLowerCase();
		HashSet<Character> vowels=new HashSet<>();
		int vowelCount=0;//To keep track of no of vowels
		for(char c:input.toCharArray()) {
			if(isVowel(c)) {
				vowels.add(c);
				if(vowels.size()>=2) {
					vowelCount=vowels.size();
				}
			}
		}
		return isPalindome(input)&& vowelCount>=2;
		
	}
	public static boolean isPalindome(String input) {
		int left=0;
		int right=input.length()-1;
		while(left<right) {
			if(input.charAt(left)!=input.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
		
	}
	public static boolean isVowel(char c) {
		return "aeiou".contains(String.valueOf(c));
	}

}
