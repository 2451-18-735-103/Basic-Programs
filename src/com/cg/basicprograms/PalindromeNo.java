package com.cg.basicprograms;

public class PalindromeNo {
   public static void main(String args[]) {
	   int num=767;
	   int temp=num;
	   int lastDigit;
	   int reverse=0;
	   while(num>0) {
		   lastDigit=num%10;
		   reverse=reverse*10+lastDigit;
		   num=num/10;
	   }
	   if(reverse==temp)
	   {
		   System.out.println("It is a Palindrome number");
	   }
	   else
	   {
		   System.out.println("It is not  palindrome number");
	   }
   }
}
