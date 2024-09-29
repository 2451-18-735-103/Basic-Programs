package com.cg.basicprograms;
public class NthLargestInArray {
  public static void main(String args[]) {
	  int arr[]= {4,6,7,9,34,78,100};
	  int k=3;
	  int index=0;
	  int max=0;
	  for(int i=1;i<=k;i++) {
		  max=arr[0];
		  for(int j=0;j<arr.length;j++)
		  {
			  if(max<arr[j])
			  {
				  max=arr[j];
				  index=j;
			  }
		  }
		  arr[index]=Integer.MIN_VALUE;
  }
	  System.out.println(max);
}
}
