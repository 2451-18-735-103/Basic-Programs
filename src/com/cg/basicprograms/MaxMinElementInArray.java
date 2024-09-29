package com.cg.basicprograms;

public class MaxMinElementInArray {
  public static void main(String args[]) {
	  int arr[]= {3,4,8,9,18,1};
	  int max=arr[0];
	  int min=arr[0];
	  for(int i=0;i<arr.length;i++)
	  {
		  if(max<arr[i])
		  {
			  max=arr[i];
		  }
		  if(arr[i]<min)
		  {
			  min=arr[i];
		  }
	  }
	  System.out.println(max);
	  System.out.println(min);
  }
}
