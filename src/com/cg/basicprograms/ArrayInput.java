package com.cg.basicprograms;

import java.util.Scanner;

public class ArrayInput {
   public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the no of elements in array");
	   int num=sc.nextInt();
	   int arr[]=new int[num];
	   System.out.println("eneter the elements");
	   for(int i=0;i<num;i++)
	   {
		   arr[i]=sc.nextInt();
	   }
	   System.out.println("entered elements are");
	   for(int i=0;i<num;i++)
	   {
		   System.out.println(arr[i]);
	   }
	   
   }
}
