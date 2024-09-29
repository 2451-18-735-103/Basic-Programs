package com.cg.basicprograms;

public class FibonacciAtIndex {
	public static void main(String args[]) {
		int a=0;
		int b=1;
		int c=0 ;
		for(int i=3;i<=9;i++)
		{
			 c=a+b;
			b=c;
			a=b;
		}
		System.out.println(c);
	}
}
