package com.cg.basicprograms;


//1 to 10 fibonacci series elements
public class FibnacciSeries {
  public static void main(String asrgs[]) {
	  int a=0;
	  int b=1;
	  int c;
	  System.out.print(a+" "+b);
	  for(int i=3;i<=10;i++)
	  {
		  c=a+b;
		  a=b;
		  b=c;
		  System.out.print(" "+c);
	  }
	 
  }
}
