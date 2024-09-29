package com.cg.basicprograms;
//print 1 to 20 prime numbers
public class PrimeNoSeries {
   public static void main(String args[]) {
	  
	   for(int num=2;num<=20;num++)
	   {
		   int count=0;
		   for(int i=1;i<=num;i++)
		   {
			   if(num%i==0)
			   {
				   count++;
				   
			   }
		   }
		   if(count==2)
		   {
			   System.out.println(num);
		   }
	   }
   }
}
