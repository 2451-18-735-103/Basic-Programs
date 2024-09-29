package com.cg.basicprograms;

public class FindCountOfNegNo {
  public static void main(String args[]) {
	  int arr[]= {0,-7,-9,-10,6,9};
	  int nCount=0;
	  int pCount=0;
	  for(int i=0;i<arr.length;i++)
	  {
	  if(arr[i]<0)
	  {
		  nCount++;
		  System.out.println(arr[i]);
	  }
	  else
	  {
		  pCount++;
	  }
	  
	  
}     
	  System.out.println("no of negative integers are  "+nCount);
}
}
