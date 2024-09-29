package com.cg.collectopic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListUserInput {
   public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	   List<Integer> list=new ArrayList<>();
	   System.out.println("Enter number of elements to add in a list");
	   int n=sc.nextInt();
	   for(int i=0;i<n;i++) {
		   System.out.println("Enter the array elements");
		   int numbers=sc.nextInt();
		   list.add(numbers);
	   }
	   System.out.println(list);
	   System.out.println("element at index "+list.get(0));
   }
}
