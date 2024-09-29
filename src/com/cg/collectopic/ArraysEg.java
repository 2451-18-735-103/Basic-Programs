package com.cg.collectopic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraysEg {
 public static void main(String args[]) {
	 int[] array = {4, 2, 7, 1, 9, 5, 3, 8, 6};
     
     // Print the original array
     System.out.println("Original array: " + Arrays.toString(array));

     // Sort the array in ascending order first
     Arrays.sort(array);
     for(int i=array.length-1;i>0;i--) {
    	 System.out.println(array[i]);
     }
 }
}
